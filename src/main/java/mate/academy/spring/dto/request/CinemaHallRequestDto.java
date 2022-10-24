package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CinemaHallRequestDto {
    @Min(value = 10)
    private int capacity;
    @NotBlank
    private String description;

    public CinemaHallRequestDto() {
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
