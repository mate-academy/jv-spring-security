package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHallRequestDto {
    @NotEmpty(message = "Cinema hall capacity can't be empty")
    @Min(value = 1, message = "Cinema hall capacity must be more than 1")
    private int capacity;

    @NotNull(message = "Cinema hall description can't be empty")
    private String description;
}
