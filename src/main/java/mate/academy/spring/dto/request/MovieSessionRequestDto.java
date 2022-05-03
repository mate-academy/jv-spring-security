package mate.academy.spring.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import mate.academy.spring.util.DateTimePatternUtil;

public class MovieSessionRequestDto {
    @NotBlank
    private Long movieId;
    @NotBlank
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
