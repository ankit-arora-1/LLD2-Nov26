package factory.AIExample.v2;

import java.util.List;

public interface BatchManager {
    public Batch createBatch(List<String> prompts);
}
