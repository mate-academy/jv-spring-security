package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Min(value = 12)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
