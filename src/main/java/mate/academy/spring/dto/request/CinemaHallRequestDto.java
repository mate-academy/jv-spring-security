package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 12)
    private int capacity;
    @Size(min = 50)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
