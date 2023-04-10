package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull(message = "Provide the movie id")
    @Min(value = 1)
    private Long movieId;
    @NotNull(message = "Provide the cinema hall id")
    @Min(value = 1)
    private Long cinemaHallId;
    @NotNull(message = "Provide the time of movie session")
    @Min(value = 1)
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
