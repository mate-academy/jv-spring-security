package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class CinemaHallRequestDto {
    @Min(value = 15)
    private int capacity;
    @NotNull
    @Size(min = 15)
    private String description;
}
