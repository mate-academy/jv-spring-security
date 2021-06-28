package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @NotNull
    @Min(value = 10)
    private int capacity; // з примітивом можемо використовувати?
    @NotNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
