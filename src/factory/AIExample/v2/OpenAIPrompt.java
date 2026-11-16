package factory.AIExample.v2;

public class OpenAIPrompt implements Prompt {
    private String prompt;

    public OpenAIPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        System.out.println("Executing OPENAI prompt: " + prompt);
    }
}
