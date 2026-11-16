package factory.AIExample.v2;

import factory.AIExample.v2.AIChatClient;
import factory.AIExample.v2.OpenAIChatClient;

public class OpenAIProviderFactory implements AIProviderFactory {
    @Override
    public BatchManager createBatchManager() {
        return new OpenAIBatchManager();
    }

    @Override
    public AIChatClient createAIChatClient() {
        return new OpenAIChatClient();
    }
}
