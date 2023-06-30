package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class CinemaHallRequestDto {
    private int capacity;
    private String description;

    @Positive
    public int getCapacity() {
        return capacity;
    }

    @NotBlank
    public String getDescription() {
        return description;
    }
}
