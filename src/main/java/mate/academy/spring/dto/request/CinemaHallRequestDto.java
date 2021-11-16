package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @Min(1)
    private int capacity;
    @NotNull
    @Length(min = 10, max = 255)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
