package factory.AIExample.v2;

public class OpenAIChatClient implements AIChatClient {
    @Override
    public OpenAIPrompt createPrompt(String prompt) {
        return new OpenAIPrompt(prompt);
    }
}
