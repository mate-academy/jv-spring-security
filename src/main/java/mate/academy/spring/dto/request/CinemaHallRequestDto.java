package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Size(min = 6)
    private int capacity;
    @Size(min = 20, max = 500)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
