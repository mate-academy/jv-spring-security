package mate.academy.spring.dto.response;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ShoppingCartResponseDto {
    @NotNull
    @Size(min = 1)
    private Long userId;
    @NotNull
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
