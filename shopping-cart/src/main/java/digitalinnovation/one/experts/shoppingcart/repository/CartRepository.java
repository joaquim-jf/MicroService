package digitalinnovation.one.experts.shoppingcart.repository;

import digitalinnovation.one.experts.shoppingcart.model.*;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
