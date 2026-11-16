package factory.AIExample.v2;

import java.util.List;

public class AnthropicBatch implements Batch {
    private List<String> batch;

    public AnthropicBatch(List<String> batch) {
        this.batch = batch;
    }

    @Override
    public void execute() {
        System.out.println("Executing batch of size: " + batch.size() );
    }
}
