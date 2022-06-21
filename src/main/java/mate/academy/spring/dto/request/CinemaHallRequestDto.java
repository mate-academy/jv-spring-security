package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    private int capacity;
    private String description;

    @Min(value = 100)
    public int getCapacity() {
        return capacity;
    }

    @NotNull
    public String getDescription() {
        return description;
    }
}
