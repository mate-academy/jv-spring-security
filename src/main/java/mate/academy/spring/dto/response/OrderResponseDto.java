package mate.academy.spring.dto.response;

import java.util.List;
import lombok.Setter;

@Setter
public class OrderResponseDto {
    private Long id;
    private List<Long> ticketIds;
    private Long userId;
    private String orderTime;
}
