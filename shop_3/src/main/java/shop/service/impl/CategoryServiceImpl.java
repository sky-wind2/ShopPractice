package shop.service.impl;


import org.springframework.stereotype.Service;

import shop.mapper.CategoryMapper;
import shop.pojo.Category;
import shop.pojo.CategoryExample;
import shop.pojo.ProductExample;
import shop.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * @see CategoryService
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<CategoryMapper,CategoryExample>
        implements CategoryService  {

}