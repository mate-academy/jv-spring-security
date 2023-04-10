package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(value = 100)
    private int capacity;
    @NotNull
    @Length(min = 10, max = 255, message = "Provide the cinema hall description")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
