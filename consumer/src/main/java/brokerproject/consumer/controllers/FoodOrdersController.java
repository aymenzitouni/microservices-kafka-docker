package brokerproject.consumer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brokerproject.consumer.entities.FoodOrder;
import brokerproject.consumer.services.FoodOrderService;

@RestController
@RequestMapping("orders")
public class FoodOrdersController {
    @Autowired
    FoodOrderService foodOrderService;

    @GetMapping
    public List<FoodOrder> getFoodOrders(){
        return foodOrderService.getFoodOrders();
    }
}
