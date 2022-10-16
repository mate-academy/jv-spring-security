package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieSessionRequestDto {
    @Min(value = 1, message = "Movie id can't be less than 1")
    private Long movieId;

    @Min(value = 1, message = "Cinema hall id can't be less than 1")
    private Long cinemaHallId;

    @NotEmpty(message = "Time can't be empty")
    private LocalDateTime showTime;
}
