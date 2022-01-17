package mate.academy.spring.dto.response;

import lombok.Setter;

@Setter
public class MovieSessionResponseDto {
    private Long movieSessionId;
    private Long movieId;
    private String movieTitle;
    private Long cinemaHallId;
    private String showTime;
}
