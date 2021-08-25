package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class CinemaHallRequestDto {
    @Positive
    private int capacity;
    @NotEmpty
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
