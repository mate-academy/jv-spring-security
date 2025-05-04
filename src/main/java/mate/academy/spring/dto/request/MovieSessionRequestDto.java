package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Positive;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @Positive
    private Long movieId;
    @Positive
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
