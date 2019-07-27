package shop.service.impl;

import org.springframework.stereotype.Service;

import shop.mapper.PropertyMapper;
import shop.pojo.PropertyExample;
import shop.service.PropertyService;

@Service
public class PropertyServiceImpl extends BaseServiceImpl<PropertyMapper,PropertyExample> implements PropertyService {
 
}