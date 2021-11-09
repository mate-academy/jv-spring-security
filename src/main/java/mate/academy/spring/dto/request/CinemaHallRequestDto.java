package mate.academy.spring.dto.request;

import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @PositiveOrZero
    private int capacity;
    @Size(min = 2)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
