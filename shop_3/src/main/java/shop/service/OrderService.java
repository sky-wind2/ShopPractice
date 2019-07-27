package shop.service;

import java.util.List;

import shop.pojo.CartItem;
import shop.pojo.Order;
import shop.pojo.User;
import shop.service.BaseService;

public interface OrderService extends BaseService{
    /**
     * 添加订单
     */
    public void createOrder(Order order ,List<CartItem> cartItems) throws Exception;
}