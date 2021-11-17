package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @Min(15)
    private int capacity;
    @NotNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
