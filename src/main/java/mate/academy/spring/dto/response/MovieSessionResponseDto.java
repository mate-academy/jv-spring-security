package mate.academy.spring.dto.response;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieSessionResponseDto {
    @NotNull
    private Long movieSessionId;
    @NotNull
    private Long movieId;
    @NotBlank @NotNull
    private String movieTitle;
    @NotNull
    private Long cinemaHallId;
    @NotNull
    private LocalDateTime showTime;

    public Long getMovieSessionId() {
        return movieSessionId;
    }

    public void setMovieSessionId(Long movieSessionId) {
        this.movieSessionId = movieSessionId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }
}
