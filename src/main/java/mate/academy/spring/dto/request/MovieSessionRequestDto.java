package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @NotNull
    private Long movieId;
    @NotNull
    private Long cinemaHallId;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimePatternUtil.DATE_TIME_PATTERN)
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
