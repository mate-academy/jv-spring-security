package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class MovieSessionRequestDto {
    @NotBlank
    private Long movieId;
    @NotBlank
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
