package shop.pojo.extension;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.ManyToOne;
import shop.pojo.Product;
import shop.pojo.User;
import shop.pojo.base.BasePOJO;

public class CommentExtension extends BasePOJO {
    @ManyToOne
    @JoinColumn(name="uid")
    private User user;
    @ManyToOne
    @JoinColumn(name="pid")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
