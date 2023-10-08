package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @NotNull
    @Positive
    private int capacity;
    @Size(min = 20, max = 256, message = "The description must be more "
            + "than 20 and less than 256 characters")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
