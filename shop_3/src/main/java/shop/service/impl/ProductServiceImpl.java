package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mapper.ProductMapper;
import shop.pojo.Product;
import shop.pojo.ProductExample;
import shop.service.CommentService;
import shop.service.OrderItemService;
import shop.service.OrderService;
import shop.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper,ProductExample> implements ProductService {

}