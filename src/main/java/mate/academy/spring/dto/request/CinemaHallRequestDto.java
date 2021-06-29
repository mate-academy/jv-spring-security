package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotBlank
    @Min(40)
    private int capacity;
    @NotBlank
    @Size(min = 16)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
