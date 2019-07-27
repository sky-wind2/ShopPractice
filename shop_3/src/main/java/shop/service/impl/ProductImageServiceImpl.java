package shop.service.impl;


import org.springframework.stereotype.Service;

import shop.mapper.ProductImageMapper;
import shop.pojo.Product;
import shop.pojo.ProductImage;
import shop.pojo.ProductImageExample;
import shop.service.ProductImageService;

import java.util.List;

@Service
public class ProductImageServiceImpl extends BaseServiceImpl<ProductImageMapper,ProductImageExample>
        implements ProductImageService {

}