package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull
    @Size(min = 1)
    private String movieTitle;
    @NotNull
    private String movieDescription;
}
