package emmortalize.com.memories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping
    public void addMemory(@RequestBody Memory memory) {memoryService.addMemory(memory);}

    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("imageFile") MultipartFile imageFile) throws Exception {
        String returnValue = "";
        memoryService.addImage(imageFile);

        return returnValue;
    }
}
