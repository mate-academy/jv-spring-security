package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CinemaHallRequestDto {
    @Min(100)
    private int capacity;
    @NotBlank(message = "Description may not be blank")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
