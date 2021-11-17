package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(1)
    private int capacity;
    @Length(min = 10, max = 255)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
