package shop.service.impl;

import org.springframework.stereotype.Service;

import shop.mapper.OrderItemMapper;
import shop.pojo.OrderItemExample;
import shop.service.OrderItemService;

@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItemMapper,OrderItemExample>
        implements OrderItemService {
 
}