package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Max(150)
    @Min(10)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
