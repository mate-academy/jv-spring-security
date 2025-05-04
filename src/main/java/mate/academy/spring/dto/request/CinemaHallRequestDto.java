package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @NotNull
    private Integer capacity;
    @NotNull
    private String description;

    public Integer getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
