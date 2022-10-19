package mate.academy.spring.dto.request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    private String title;
    @NotNull
    @Length(min = 20)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
