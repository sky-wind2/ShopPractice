package shop.pojo.extension;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.ManyToOne;
import shop.pojo.Comment;
import shop.pojo.Order;
import shop.pojo.Product;
import shop.pojo.base.BasePOJO;

public class OrderItemExtension extends BasePOJO {
    @ManyToOne
    @JoinColumn(name="pid")
    private Product product;
    @ManyToOne
    @JoinColumn(name="oid")
    private Order order;
    @ManyToOne
    @JoinColumn(name="cmid")
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
