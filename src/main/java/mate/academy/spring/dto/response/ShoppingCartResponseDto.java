package mate.academy.spring.dto.response;

import java.util.List;
import lombok.Setter;

@Setter
public class ShoppingCartResponseDto {
    private Long userId;
    private List<Long> ticketIds;
}
