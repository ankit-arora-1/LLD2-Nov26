package factory.AIExample.v1;

public class AnthropicChatClient implements AIChatClient {
    @Override
    public AnthropicPrompt createPrompt(String prompt) {
        return new AnthropicPrompt(prompt);
    }
}
