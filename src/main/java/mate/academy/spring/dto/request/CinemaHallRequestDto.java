package mate.academy.spring.dto.request;

import org.hibernate.validator.constraints.Range;

public class CinemaHallRequestDto {
    @Range(min = 50, max = 1000)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
