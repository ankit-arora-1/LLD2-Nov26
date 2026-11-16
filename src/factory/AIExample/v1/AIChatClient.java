package factory.AIExample.v1;

public interface AIChatClient {

    // This is a factory method whose job is to create different kinds of prompt objects
    public Prompt createPrompt(String prompt);

    // Common for all kinds of clients. This is not a factory method.
    public default void log() {
       System.out.println("Logging all prompts");
    }
}
