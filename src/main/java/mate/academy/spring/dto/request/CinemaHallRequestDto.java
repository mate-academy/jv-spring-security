package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 15)
    private int capacity;
    private String description;

    @NotNull
    @Size(min = 15)
    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
