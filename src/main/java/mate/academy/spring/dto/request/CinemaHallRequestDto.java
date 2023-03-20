package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(value = 0)
    private int capacity;
    @NotNull(message = "Please enter a description for cinema hall.")
    @Length(min = 3, max = 1000)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
