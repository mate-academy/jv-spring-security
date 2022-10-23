package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(value = 1, message = "Capacity cinema hall may be more 1")
    private int capacity;
    @NotEmpty(message = "Description cinema hall may not be empty")
    @Size(min = 2, message = "Description cinema hall may be more 2 characters")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
