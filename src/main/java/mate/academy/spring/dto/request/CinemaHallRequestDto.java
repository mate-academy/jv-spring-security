package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaHallRequestDto {
    @Min(20)
    @Max(300)
    private int capacity;
    @NotNull
    @Size(min = 20, max = 200)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
