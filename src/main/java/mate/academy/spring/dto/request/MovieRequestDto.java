package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull(message = "Movie title may not be empty")
    private String movieTitle;
    @NotNull(message = "Movie description may not be empty")
    private String movieDescription;
}
