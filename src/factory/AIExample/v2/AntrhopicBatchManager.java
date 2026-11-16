package factory.AIExample.v2;

import java.util.List;

public class AntrhopicBatchManager implements BatchManager {
    @Override
    public AnthropicBatch createBatch(List<String> prompts) {
        return new AnthropicBatch(prompts);
    }
}
