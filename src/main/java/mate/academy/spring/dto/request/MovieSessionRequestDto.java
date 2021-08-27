package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;

public class MovieSessionRequestDto {
    @NonNull
    @Min(value = 0)
    private Long movieId;
    @NonNull
    @Min(value = 0)
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
