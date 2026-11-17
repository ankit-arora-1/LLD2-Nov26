package factory.AIChatClientExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        // Registration happens outside the factory, so the factory is closed for modification
//        AIChatClientFactory.register("openai", OpenAIChatClient::new);
//        AIChatClientFactory.register("anthropic", AntrhopicChatClient::new);
//
//        // Any client can plug in a brand new model at runtime without touching the factory.
//        // (AIChatClient and Prompt have a single method each, so lambdas work here.)
//        AIChatClientFactory.register("gemini", () -> prompt ->
//                () -> System.out.println("Gemini prompt. Executing: " + prompt));
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the model you want to use " + AIChatClientFactory.getSupportedModels());
//        String model = bufferedReader.readLine();
//        System.out.println("Enter your prompt");
//        String prompt = bufferedReader.readLine();
//
//        AIChatClient aiChatClient = AIChatClientFactory
//                .getAIChatClient(model);
//
//        Prompt p = aiChatClient.createPrompt(prompt);
//        p.execute();
    }
}
