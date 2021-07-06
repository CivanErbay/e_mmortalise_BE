
package emmortalize.com.memories;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryDb {

    private final List<Memory> memoryList = new ArrayList(List.of(
            new Memory(1L,
                    "Fatima Jawara",
                    List.of(-3, 36.2),
                    LocalDate.of(1990, Month.MAY, 19),
                    LocalDate.of(2021, Month.MAY, 20),
                    "Serrekunda",
                    "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.")

    ));

    public List<Memory> getMemoryList() {
        return memoryList;
    }

    public void addMemory(Memory memory) {
        memoryList.add(memory);
    }
}