package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class CinemaHallRequestDto {
    @Min(value = 1, message = "Cinema hall capacity must be greater than 0")
    private int capacity;
    @NotNull(message = "Cinema hall description can't be null")
    private String description;
}
