package factory.AIChatClientExample;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class AIChatClientFactory {

    // Practical factory, registry based (no if-else, follows OCP).
    // Instead of hard-coding which classes exist, the factory keeps a registry of
    // "model name -> how to create the client". Adding a new model = registering it,
    // the factory code itself never changes.
    //
    // Supplier is used (instead of storing an instance) so that every call to
    // getAIChatClient() returns a fresh object, same as `new` did earlier.
    // ConcurrentHashMap so that clients can be registered at runtime from any thread.
    private static final Map<String, Supplier<? extends AIChatClient>> registry = new ConcurrentHashMap<>();

    private AIChatClientFactory() {
    }

    public static void register(String model, Supplier<? extends AIChatClient> creator) {
        if (model == null || creator == null) {
            throw new IllegalArgumentException("model and creator must not be null");
        }
        registry.put(normalize(model), creator);
    }

    public static void unregister(String model) {
        registry.remove(normalize(model));
    }

    public static AIChatClient getAIChatClient(String model) {
        Supplier<? extends AIChatClient> creator = registry.get(normalize(model));
        if (creator == null) {
            throw new IllegalArgumentException("Unsupported model: " + model
                    + ". Supported models: " + getSupportedModels());
        }
        return creator.get();
    }

    public static Set<String> getSupportedModels() {
        return Set.copyOf(registry.keySet());
    }

    // Keeps lookups case-insensitive, like equalsIgnoreCase did earlier
    private static String normalize(String model) {
        return model == null ? "" : model.trim().toLowerCase();
    }
}
