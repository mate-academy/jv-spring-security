package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieSessionRequestDto {
    @NotNull
    @Min(0)
    private Long movieId;
    @NotNull
    @Min(0)
    private Long cinemaHallId;
    @NotNull
    private LocalDateTime showTime;
}
