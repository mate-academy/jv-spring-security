package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    private int capacity;
    private String description;

    @Min(0)
    public int getCapacity() {
        return capacity;
    }

    @NotNull
    public String getDescription() {
        return description;
    }
}
