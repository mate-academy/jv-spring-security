package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @Min(20)
    private int capacity;
    @NotNull
    @Max(500)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
