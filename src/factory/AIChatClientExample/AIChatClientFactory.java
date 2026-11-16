package factory.AIChatClientExample;

import java.util.HashMap;

public class AIChatClientFactory {

    // Practical factory
    // Think of removing if else as well
    public static AIChatClient getAIChatClient(String model) {
        if(model.equalsIgnoreCase("openai")) {
            return new OpenAIChatClient();
        } else if(model.equalsIgnoreCase("anthropic")) {
            return new AntrhopicChatClient();
        }

        return null;
    }
}
