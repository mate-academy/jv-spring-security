package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieSessionRequestDto {
    private Long movieId;
    @NotNull
    private Long cinemaHallId;
    @NotNull
    private LocalDateTime showTime;
}
