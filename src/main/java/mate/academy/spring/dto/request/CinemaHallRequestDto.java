package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import javax.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Min(value = 0)
    private int capacity;
    @NotNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
