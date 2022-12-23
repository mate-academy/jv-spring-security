package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Min(10)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
