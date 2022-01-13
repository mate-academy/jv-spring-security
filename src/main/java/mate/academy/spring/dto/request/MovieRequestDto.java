package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull(message = "Movie title can't be null")
    private String movieTitle;
    @NotNull(message = "Movie description can't be null")
    private String movieDescription;
}
