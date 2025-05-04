package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class CinemaHallRequestDto {
    @Positive(message = "Invalid capacity, value should be positive")
    private int capacity;
    @NotEmpty(message = "Please enter description")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
