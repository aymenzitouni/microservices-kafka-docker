package brokerproject.producer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brokerproject.producer.DTOs.FoodOrderDto;
import brokerproject.producer.services.FoodOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Slf4j
@RestController
@RequestMapping("order")
public class FoodOrderController {

    @Autowired
    FoodOrderService foodOrderService;
    

    @PostMapping
    public String createFoodOrder(@RequestBody FoodOrderDto foodOrder) throws JsonProcessingException {
        log.info("create food order request received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
