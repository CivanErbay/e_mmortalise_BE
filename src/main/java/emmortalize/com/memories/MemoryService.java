package emmortalize.com.memories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class MemoryService {
    public List<Memory> getMemories() {
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
}
