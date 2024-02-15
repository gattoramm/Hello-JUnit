package OrderProcessingService.bo;

import OrderProcessingService.bo.exception.BOException;
import OrderProcessingService.dto.Order;

public interface OrderBO {
    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;
}
