package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    private static final byte MIN_ID_NUMBER = 1;
    @NotNull(message = "Please provide a movieId")
    @Min(value = MIN_ID_NUMBER, message = "The movieId must be more than " + MIN_ID_NUMBER)
    @Max(value = Integer.MAX_VALUE, message = "The movieId must be less than " + Integer.MAX_VALUE)
    private Long movieId;
    @NotNull(message = "Please provide a cinemaHallId")
    @Min(value = MIN_ID_NUMBER, message = "The cinemaHallId must be more than " + MIN_ID_NUMBER)
    @Max(value = Integer.MAX_VALUE, message = "The cinemaHallId must be less than "
            + Integer.MAX_VALUE)
    private Long cinemaHallId;
    @NotNull(message = "Please provide a showTime")
    @FutureOrPresent(message = "The date must be in the future")
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
