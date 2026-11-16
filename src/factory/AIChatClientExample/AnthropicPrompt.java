package factory.AIChatClientExample;

public class AnthropicPrompt implements Prompt {

    private String prompt;

    public AnthropicPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        System.out.println("Antrhopic prompt. Executing: " + prompt);
    }
}
