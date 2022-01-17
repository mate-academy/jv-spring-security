package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 20)
    @Max(value = 150)
    private int capacity;
    @Size(min = 5)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
