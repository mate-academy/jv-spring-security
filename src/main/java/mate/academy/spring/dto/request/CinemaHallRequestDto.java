package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Size(min = 50, max = 155)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
