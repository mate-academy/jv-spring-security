package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotNull
    @Min(value = 1, message = "Capacity Can't be negative or 0. ")
    private int capacity;
    @NotNull
    @Size(min = 20, max = 100)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
