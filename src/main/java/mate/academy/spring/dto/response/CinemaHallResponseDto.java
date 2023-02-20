package mate.academy.spring.dto.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CinemaHallResponseDto {
    @NotNull
    private Long id;
    @NotNull
    private int capacity;
    @NotBlank @NotNull
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
