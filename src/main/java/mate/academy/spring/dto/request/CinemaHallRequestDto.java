package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class CinemaHallRequestDto {
    @Min(0)
    private int capacity;
    @NotEmpty
    private String description;
}
