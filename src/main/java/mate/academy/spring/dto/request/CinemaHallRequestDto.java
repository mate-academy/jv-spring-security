package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class CinemaHallRequestDto {
    private int capacity;
    @NotEmpty
    private String description;
}
