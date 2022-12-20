package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotNull
    @Positive
    private int capacity;
    @NotNull
    @NotBlank(message = "field can't be empty")
    @Size(min = 1, max = 256)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
