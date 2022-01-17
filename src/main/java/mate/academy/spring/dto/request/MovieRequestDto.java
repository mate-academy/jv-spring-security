package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull(message = "Movie title can't be null")
    @Size(min = 1)
    private String movieTitle;
    @NotNull(message = "Movie description can't be null")
    @Size(min = 1)
    private String movieDescription;
}
