package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CinemaHallRequestDto {
    @Min(value = 0)
    @Max(value = 500)
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
