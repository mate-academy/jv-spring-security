package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Positive
    @Min(value = 1)
    private int capacity;
    @NotNull
    @Size(min = 15)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
