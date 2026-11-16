package factory.AIExample.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which provider would you like to use: OpenAI or Anthropic");
        String provider = br.readLine();

        AIChatClient aiChatClient = null;
        if(provider.equalsIgnoreCase("openai")) {
           aiChatClient = new OpenAIChatClient();
        } else if(provider.equalsIgnoreCase("anthropic")) {
            aiChatClient = new AnthropicChatClient();
        }

        System.out.println("Enter prompt");
        String inputPrompt = br.readLine();

        Prompt prompt = aiChatClient.createPrompt(inputPrompt);
        prompt.execute();

    }
}
