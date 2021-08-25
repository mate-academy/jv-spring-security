package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class CinemaHallRequestDto {
    @NotNull
    @Min(1)
    private int capacity;
    private String description;
}
