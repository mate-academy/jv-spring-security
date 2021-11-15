package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    private Long movieId;
    @NonNull
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
