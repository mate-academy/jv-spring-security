package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Size(min = 20, max = 400)
    private int capacity;
    @Size(min = 10, max = 1000)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
