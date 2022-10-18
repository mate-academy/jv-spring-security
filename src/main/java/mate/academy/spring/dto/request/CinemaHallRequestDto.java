package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHallRequestDto {
    @Positive
    @Max(value = 50000, message = "Cinema hall capacity can't be more than 50000")
    private int capacity;

    @NotNull(message = "Cinema hall description can't be empty")
    private String description;
}
