package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class CinemaHallRequestDto {
    @PositiveOrZero
    @NotNull
    private int capacity;
    @NotNull
    @Max(1000)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
