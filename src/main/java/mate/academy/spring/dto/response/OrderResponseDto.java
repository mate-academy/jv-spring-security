package mate.academy.spring.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import javax.validation.constraints.NotNull;

public class OrderResponseDto {
    @NotNull
    private Long id;
    private List<Long> ticketIds;
    @NotNull
    private Long userId;
    @NotNull
    private LocalDateTime orderTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getTicketIds() {
        return ticketIds;
    }

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
