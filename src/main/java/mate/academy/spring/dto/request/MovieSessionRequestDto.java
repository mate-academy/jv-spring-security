package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

public class MovieSessionRequestDto {
    @NotNull
    @Min(value = 0)
    private Long movieId;

    @NotNull
    @Min(value = 0)
    private Long cinemaHallId;

    @NotNull
    @DateTimeFormat
    private LocalDateTime showTime;

    public Long getMovieId() {
        return movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }
}
