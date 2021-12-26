package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(1)
    private int capacity;
    @Size(min = 5, max = 1000)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
