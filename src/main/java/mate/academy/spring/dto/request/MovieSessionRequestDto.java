package mate.academy.spring.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @NotNull
    @Positive
    private Long movieId;
    @NotNull
    @Positive
    private Long cinemaHallId;
    @JsonFormat(pattern = DateTimePatternUtil.DATE_TIME_PATTERN)
    @FutureOrPresent
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
