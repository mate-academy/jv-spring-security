package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 10, message = "Capacity must be greater then 10")
    private int capacity;
    @NotNull(message = "Please enter description")
    @Size(min = 2, message = "Description must be greater then 2")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
