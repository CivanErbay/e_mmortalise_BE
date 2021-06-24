package emmortalize.com.memories;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/memories")
public class MemoryController {

    @GetMapping
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
