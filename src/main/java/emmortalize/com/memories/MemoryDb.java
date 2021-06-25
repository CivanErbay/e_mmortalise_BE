
package emmortalize.com.memories;
/*
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemoryDb extends MongoRepository<Memory, String> {
}
*/

import emmortalize.com.memories.Memory;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Repository
public class MemoryDb {

    public List<Memory> getMemoryList() {
        return List.of(
                new Memory(
                        1L,
                        "Fatim Jawara",
                        List.of(-3,25.2),
                        LocalDate.of(1990, Month.MAY, 19),
                        LocalDate.of(2021, Month.MAY, 20),
                        "Serrekunda",
                        "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua."
                )
        );
    }

    /*public Memory addMemory(Memory memory) {
        new List<Memory>
    }*/
}