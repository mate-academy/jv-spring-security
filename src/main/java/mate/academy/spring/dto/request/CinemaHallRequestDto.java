package mate.academy.spring.dto.request;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotNull
    @Digits(integer = 0, fraction = 0)
    private int capacity;
    @NotNull
    @Size(min = 8)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
