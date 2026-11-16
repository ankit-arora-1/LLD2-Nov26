package factory.AIChatClientExample;

public class OpenAIPrompt implements Prompt {
    private String prompt;

    public OpenAIPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        System.out.println("OpenAI prompt. Executing: " + prompt);
    }
}
