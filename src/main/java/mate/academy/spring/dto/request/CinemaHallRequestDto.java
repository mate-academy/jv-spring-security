package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class CinemaHallRequestDto {
    @NotBlank
    private int capacity;
    @NotBlank
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
