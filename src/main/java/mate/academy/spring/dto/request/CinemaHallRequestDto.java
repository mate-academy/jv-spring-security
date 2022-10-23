package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class CinemaHallRequestDto {
    @Min(value = 1)
    private int capacity;
    @NonNull
    @Size(min = 100)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
