package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Size(min = 1, max = 255)
    private int capacity;
    @Size(min = 1, max = 255)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
