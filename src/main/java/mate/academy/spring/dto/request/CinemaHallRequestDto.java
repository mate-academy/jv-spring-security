package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CinemaHallRequestDto {
    @Min(50)
    private int capacity;
    @NotNull
    @Size(min = 3)
    private String description;
}
