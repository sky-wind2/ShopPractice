package shop.service.impl;

import org.springframework.stereotype.Service;

import shop.mapper.CartItemMapper;
import shop.pojo.CartItemExample;
import shop.service.CartItemService;
import shop.service.PropertyService;

@Service
public class CartItemServiceImpl extends BaseServiceImpl<CartItemMapper,CartItemExample>
        implements CartItemService {
 
}