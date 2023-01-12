package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import org.springframework.lang.NonNull;

public class CinemaHallRequestDto {
    @Min(40)
    private int capacity;
    @NonNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
