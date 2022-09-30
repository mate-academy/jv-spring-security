package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(value = 10)
    private int capacity;
    @NotNull(message = "Please provide a cinema hall description")
    @Length(min = 10, max = 100)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
