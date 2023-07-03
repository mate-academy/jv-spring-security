package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

public class CinemaHallRequestDto {
    @NotNull
    @Size(min = 20, max = 80)
    private int capacity;
    @NotNull
    @Length(min = 3, max = 50)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
