package mate.academy.spring.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponseDto {
    private Long movieId;
    private String movieTitle;
    private String movieDescription;
}
