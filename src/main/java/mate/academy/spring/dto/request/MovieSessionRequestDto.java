package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    @Min(1)
    private Long movieId;
    @NonNull
    @Min(1)
    private Long cinemaHallId;
    @NonNull
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
