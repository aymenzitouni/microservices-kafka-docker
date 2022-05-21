package brokerproject.consumer.services;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import brokerproject.consumer.DTOs.FoodOrderDto;
import brokerproject.consumer.entities.FoodOrder;
import brokerproject.consumer.repositories.FoodOrdersRepository;

@Slf4j
@Service
public class FoodOrderService {
    @Autowired
    FoodOrdersRepository foodOrdersRepository;

    

    public void persistFoodOrder(FoodOrder foodOrder) {
        FoodOrder persistedFoodOrder = foodOrdersRepository.save(foodOrder);
        log.info("food order persisted {}", persistedFoodOrder);
    }

    public List<FoodOrder> getFoodOrders(){
    List<FoodOrder> foodOrders = foodOrdersRepository.findAll();
    return foodOrders;
    }

}