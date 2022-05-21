package brokerproject.producer.DTOs;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrderDto {
    String item;
    Double amount;
}
