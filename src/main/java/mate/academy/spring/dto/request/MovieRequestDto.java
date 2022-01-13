package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @NotNull
    private String movieDescription;
}
