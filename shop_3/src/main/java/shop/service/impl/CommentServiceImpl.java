package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mapper.CommentMapper;
import shop.pojo.Comment;
import shop.pojo.CommentExample;
import shop.pojo.Order;
import shop.pojo.OrderItem;
import shop.service.CommentService;
import shop.service.OrderItemService;
import shop.service.OrderService;

import java.util.List;

@Service
public class CommentServiceImpl extends BaseServiceImpl<CommentMapper,CommentExample>
        implements CommentService {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;
    @Override
    public boolean checkFinishComment(Order order) {
        List<OrderItem> orderItems = order.getOrderItems();
        for(OrderItem orderItem:orderItems){
            if(orderItem.getComment()==null){
                return false;
            }
        }
        return true;
    }
}