package factory.AIChatClientExample;

public class OpenAIChatClient implements AIChatClient {
    @Override
    public Prompt createPrompt(String prompt) {
        return new OpenAIPrompt(prompt);
    }
}
