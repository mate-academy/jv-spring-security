package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @Min(1)
    private Long movieId;
    @Min(1)
    private Long cinemaHallId;
    @Pattern(regexp = DateTimePatternUtil.DATE_TIME_PATTERN,
            message = "Invalid date format, should be: " + DateTimePatternUtil.DATE_TIME_PATTERN)
    @Future
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
