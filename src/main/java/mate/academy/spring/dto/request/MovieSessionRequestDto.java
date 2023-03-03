package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    @Min(value = 0)
    private Long movieId;
    @NonNull
    @Min(value = 0)
    private Long cinemaHallId;
    @NonNull
    @Min(value = 0)
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
