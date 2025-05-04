package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @Min(1)
    private Long movieId;
    @Min(1)
    private Long cinemaHallId;
    @NotNull(message = "Please provide a showTime")
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
