package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @NotNull
    private String movieDescription;
}
