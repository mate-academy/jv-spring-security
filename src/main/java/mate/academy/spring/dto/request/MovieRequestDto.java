package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotEmpty
    private String title;
    @NotEmpty
    private String description;
}
