package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @NotNull
    @Size(min = 15)
    private String movieDescription;
}
