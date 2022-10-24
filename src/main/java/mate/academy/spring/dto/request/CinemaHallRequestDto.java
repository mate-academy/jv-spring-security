package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;

public class CinemaHallRequestDto {
    @NegativeOrZero
    private int capacity;
    @NotBlank
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
