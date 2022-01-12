package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CinemaHallRequestDto {
    @Min(value = 0)
    private int capacity;
    @NotNull
    private String description;
}
