package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Positive;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    private Long movieId;
    @NonNull
    @Positive
    private Long cinemaHallId;
    @NonNull
    @Positive
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
