package mate.academy.spring.dto.request;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Positive;

public class MovieSessionRequestDto {
    @Positive(message = "id should be a positive")
    private Long movieId;
    @Positive(message = "id should be a positive")
    private Long cinemaHallId;
    @FutureOrPresent(message = "show time should not be in the past")
    private String showTime;

    public Long getMovieId() {
        return movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public String getShowTime() {
        return showTime;
    }
}
