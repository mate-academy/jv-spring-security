package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    @Min(value = 1)
    private Long movieId;
    @NonNull
    @Min(value = 1)
    private Long cinemaHallId;
    @NonNull
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
