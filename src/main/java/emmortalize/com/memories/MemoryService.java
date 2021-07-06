package emmortalize.com.memories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public void addImage(MultipartFile imageFile) throws Exception {
       String folder = "/photos/";
       byte[] bytes = imageFile.getBytes();
       Path path = Paths.get(folder + imageFile.getOriginalFilename());
       Files.write(path, bytes);
    }

}
