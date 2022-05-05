package mate.academy.spring.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @Min(value = 1)
    private Long movieId;
    @Min(value = 1)
    private Long cinemaHallId;
    @Future
    @JsonFormat(pattern = DateTimePatternUtil.DATE_TIME_PATTERN)
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
