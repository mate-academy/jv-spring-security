package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

public class MovieSessionRequestDto {
    @NotNull
    private Long movieId;
    @NotNull
    private Long cinemaHallId;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
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
