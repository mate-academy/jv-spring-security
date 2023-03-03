package mate.academy.spring.dto.request;

import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

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
