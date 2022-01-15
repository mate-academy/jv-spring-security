package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieSessionRequestDto {
    @Min(value = 1)
    private Long movieId;
    @Min(value = 1)
    private Long cinemaHallId;
    @NotNull
    private String showTime;
}
