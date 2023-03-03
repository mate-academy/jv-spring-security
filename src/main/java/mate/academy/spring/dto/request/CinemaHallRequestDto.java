package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;

public class CinemaHallRequestDto {
    @NotNull
    private int capacity;
    @NotNull
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
