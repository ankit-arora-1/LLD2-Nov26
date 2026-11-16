package factory.AIExample.v2;

public interface AIChatClient {

    // This is a factory method whose job is to create different kinds of prompt objects
    public Prompt createPrompt(String prompt);
}
