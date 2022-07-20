package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.util.DateTimePatternUtil;
import org.springframework.format.annotation.DateTimeFormat;

public class MovieSessionRequestDto {
    @Min(1)
    private Long movieId;
    @Min(1)
    private Long cinemaHallId;
    @NotNull
    @DateTimeFormat(pattern = DateTimePatternUtil.DATE_TIME_PATTERN)
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
