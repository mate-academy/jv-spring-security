package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(value = 11, message = "The Capacity should be > 10.")
    private int capacity;
    @Length(max=255, message = "The Description should be < 255 characters.")
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
