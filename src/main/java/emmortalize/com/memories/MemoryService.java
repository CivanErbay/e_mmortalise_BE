package emmortalize.com.memories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemoryService {

   private MemoryDb memoryDb;

   @Autowired
    public MemoryService(MemoryDb memoryDb) {
        this.memoryDb = memoryDb;
    }

    public List<Memory> getMemories() {
       return memoryDb.getMemoryList();
    }

    public void addMemory(Memory memory) {
       memoryDb.addMemory(memory);
    }

}
