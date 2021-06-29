package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @NotNull
    private int capacity;
    @NotNull
    @Max(256)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
