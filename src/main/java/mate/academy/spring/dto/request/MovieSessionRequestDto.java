package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieSessionRequestDto {
    @NotNull
    @Min(1)
    private Long movieId;
    @NotNull
    @Min(1)
    private Long cinemaHallId;
    @NotNull
    @Size(min = 5)
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
