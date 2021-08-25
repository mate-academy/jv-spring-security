package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class MovieSessionRequestDto {
    private static final int MIN_VALUE_FOR_IDS = 1;

    @Min(value = MIN_VALUE_FOR_IDS)
    private Long movieId;
    @Min(value = MIN_VALUE_FOR_IDS)
    private Long cinemaHallId;
    @NotEmpty
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
