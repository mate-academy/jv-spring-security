package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import java.time.LocalDateTime;
import javax.validation.constraints.Min;

public class MovieSessionRequestDto {
    @NotNull
    @Min(1)
    private Long movieId;
    @Min(1)
    @NotNull
    private Long cinemaHallId;
    @NotNull
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
