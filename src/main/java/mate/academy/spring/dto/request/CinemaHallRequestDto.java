package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @NotNull
    @Positive
    private int capacity;
    @Length(max = 255)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
