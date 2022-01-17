package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @Max(150)
    @Min(10)
    @NotNull
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
