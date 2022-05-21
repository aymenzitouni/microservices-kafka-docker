package brokerproject.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import brokerproject.consumer.entities.FoodOrder;

public interface FoodOrdersRepository extends JpaRepository<FoodOrder,Long>{
    
}
