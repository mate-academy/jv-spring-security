package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    private Long movieId;
    @NonNull
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
