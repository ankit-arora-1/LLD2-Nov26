package factory.AIChatClientExample;

public interface AIChatClient {
    // Factory method. Because, its job is to return different kinds of Prompt objects
    public Prompt createPrompt(String prompt);

}
