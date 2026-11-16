package factory.AIExample.v2;

import factory.AIExample.v2.AIChatClient;

public class Client {
    public static void main(String[] args) {
        // We can also create OpenAIChatClient here
//        AIChatClient aiChatClient = new AnthropicChatClient();
//        BatchManager batchManager = new OpenAIBatchManager();

        AIProviderFactory aiProviderFactory = new OpenAIProviderFactory();
        AIChatClient aiChatClient = aiProviderFactory.createAIChatClient();

        BatchManager batchManager = aiProviderFactory.createBatchManager();

        Prompt prompt = aiChatClient.createPrompt("Test prompt");
        prompt.execute();

    }
}
