package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @Min(1)
    @NotNull
    private Long movieId;
    @Min(1)
    @NotNull
    private Long cinemaHallId;
    @NotBlank
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
