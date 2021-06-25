package emmortalize.com.memories;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "memories")
public class Memory {
    @Id
    private Long id;
    private String name;
    private List<Number> position;
    private LocalDate birthdate;
    private LocalDate deathdate;
    private String origin;
    private String description;

    public Memory() {
    }

    public Memory(Long id, String name, List<Number> position, LocalDate birthdate, LocalDate deathdate, String origin, String description) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.birthdate = birthdate;
        this.deathdate = deathdate;
        this.origin = origin;
        this.description = description;
    }

    public Memory(String name, List<Number> position, LocalDate birthdate, LocalDate deathdate, String origin, String description) {
        this.name = name;
        this.position = position;
        this.birthdate = birthdate;
        this.deathdate = deathdate;
        this.origin = origin;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Number> getPosition() {
        return position;
    }

    public void setPosition(List<Number> position) {
        this.position = position;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getDeathdate() {
        return deathdate;
    }

    public void setDeathdate(LocalDate deathdate) {
        this.deathdate = deathdate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", birthdate=" + birthdate +
                ", deathdate=" + deathdate +
                ", origin='" + origin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
