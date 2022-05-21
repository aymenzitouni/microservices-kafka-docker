package brokerproject.producer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import brokerproject.producer.DTOs.FoodOrderDto;
import brokerproject.producer.services.producer.Producer;

@Slf4j
@Service
public class FoodOrderService {

    private final Producer producer;

    @Autowired
    public FoodOrderService(Producer producer) {
        this.producer = producer;
    }

    public String createFoodOrder(FoodOrderDto foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }
}