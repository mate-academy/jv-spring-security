package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    private static final int MIN_CAPACITY = 8000;
    @NotNull
    @Min(value = MIN_CAPACITY)
    private int capacity;
    @NotNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
