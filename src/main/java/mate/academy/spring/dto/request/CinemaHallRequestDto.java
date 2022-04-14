package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 10, message = "Capacity must be at least 10")
    private int capacity;
    @NotNull(message = "Description can't be null")
    @Size(min = 5, message = "Description must contain at least 5 characters")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
