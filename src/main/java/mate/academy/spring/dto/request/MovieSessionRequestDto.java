package mate.academy.spring.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @Positive
    private Long movieId;
    @Positive
    private Long cinemaHallId;
    @NotEmpty
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
