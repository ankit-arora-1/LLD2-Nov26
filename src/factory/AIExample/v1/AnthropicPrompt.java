package factory.AIExample.v1;

public class AnthropicPrompt implements Prompt {

    private String prompt;

    public AnthropicPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        System.out.println("Executing ANTHROPIC prompt: " + prompt);
    }
}
