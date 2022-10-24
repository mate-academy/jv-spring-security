package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(20)
    private int capacity;
    @NotNull(message = "Please enter description")
    @Size(min = 5, max = 10, message = "Description size must be min=5 and max=10")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
