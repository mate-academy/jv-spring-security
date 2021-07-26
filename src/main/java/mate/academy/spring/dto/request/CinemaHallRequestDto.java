package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotNull
    @Min(value = 2)
    private int capacity;
    @NotNull
    @Size(min = 8)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
