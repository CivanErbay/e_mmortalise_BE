package emmortalize.com.memories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/memories")
public class MemoryController {

    private final MemoryService memoryService;

    @Autowired
    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping
    public List<Memory> getMemories() {
        return memoryService.getMemories();
    }

  /*  @PutMapping
    public Memory addMemory(@RequestBody Memory memory) {
        return memoryService.addMemory(memory);
    }*/
}
