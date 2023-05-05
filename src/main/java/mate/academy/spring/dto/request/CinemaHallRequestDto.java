package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.PositiveOrZero;

public class CinemaHallRequestDto {
    @PositiveOrZero
    private int capacity;
    @Max(value = 500)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
