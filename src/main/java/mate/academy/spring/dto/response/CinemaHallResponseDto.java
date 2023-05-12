package mate.academy.spring.dto.response;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallResponseDto {
    @NotNull
    @Size(min = 1)
    private Long id;
    @Size(min = 1)
    private int capacity;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
