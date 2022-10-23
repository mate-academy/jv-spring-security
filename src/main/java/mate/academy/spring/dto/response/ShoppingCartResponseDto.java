package mate.academy.spring.dto.response;

import java.util.List;
import javax.validation.constraints.Min;

public class ShoppingCartResponseDto {
    @Min(value = 1)
    private Long userId;
    @Min(value = 1)
    private List<Long> ticketIds;

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
}
