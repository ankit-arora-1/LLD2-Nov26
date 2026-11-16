package factory.AIExample.v2;

import java.util.List;

public class OpenAIBatchManager implements BatchManager {
    @Override
    public Batch createBatch(List<String> prompts) {
        return new OpenAIBatch(prompts);
    }
}
