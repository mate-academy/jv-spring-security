package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Positive
    @Max(value = 500)
    private int capacity;
    @NotNull
    @Size(min = 3, max = 200)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
