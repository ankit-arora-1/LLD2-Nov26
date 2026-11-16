package factory.AIExample.v2;

import factory.AIExample.v2.AIChatClient;

public interface AIProviderFactory {
    public BatchManager createBatchManager();
    public AIChatClient createAIChatClient();
}
