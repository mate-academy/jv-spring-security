package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Min(20)
    private int capacity;
    @Min(50)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
