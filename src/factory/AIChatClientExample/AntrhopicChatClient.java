package factory.AIChatClientExample;

public class AntrhopicChatClient implements AIChatClient {
    @Override
    public Prompt createPrompt(String prompt) {
        return new AnthropicPrompt(prompt);
    }
}
