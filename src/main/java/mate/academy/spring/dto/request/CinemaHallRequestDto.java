package mate.academy.spring.dto.request;

import javax.validation.constraints.*;

public class CinemaHallRequestDto {
    private static final byte MIN_CAPACITY = 1;
    @NotNull(message = "Please provide a capacity")
    @Max(value = Integer.MAX_VALUE, message = "The capacity must be less then " + Integer.MAX_VALUE)
    @Min(value = MIN_CAPACITY, message = "The capacity must be more then " + MIN_CAPACITY)
    private int capacity;
    @NotEmpty(message = "Please provide a description")
    @Size(message = "The description length must be less then " + Integer.MAX_VALUE)
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
