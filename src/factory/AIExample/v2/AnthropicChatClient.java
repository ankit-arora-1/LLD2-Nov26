package factory.AIExample.v2;

public class AnthropicChatClient implements AIChatClient {
    @Override
    public AnthropicPrompt createPrompt(String prompt) {
        return new AnthropicPrompt(prompt);
    }
}
