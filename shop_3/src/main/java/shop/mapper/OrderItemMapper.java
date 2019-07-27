package shop.mapper;

import java.util.List;

import shop.pojo.OrderItem;
import shop.pojo.OrderItemExample;

public interface OrderItemMapper extends BaseMapper<OrderItem, OrderItemExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderItem record);
}