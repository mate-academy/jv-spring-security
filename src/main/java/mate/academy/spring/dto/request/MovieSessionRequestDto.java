package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieSessionRequestDto {
    @NotNull(message = "Movie's id can't be null")
    @Min(value = 1, message = "Movie's id can't be negative or 0")
    private Long movieId;
    @NotNull(message = "Cinema hall id can't be null")
    @Min(value = 1, message = "Cinema hall id can't be negative or 0")
    private Long cinemaHallId;
    @NotNull(message = "Session time can't be null")
    private String showTime;
}
