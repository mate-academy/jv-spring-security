package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieRequestDto {
    @NotNull(message = "Movie title can't be empty")
    private String title;

    @NotNull(message = "Movie description can't be empty")
    private String description;
}
