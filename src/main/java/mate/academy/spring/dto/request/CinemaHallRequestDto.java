package mate.academy.spring.dto.request;

import javax.validation.constraints.Positive;

public class CinemaHallRequestDto {
    @Positive
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
