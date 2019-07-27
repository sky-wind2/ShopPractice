package shop.pojo.extension;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.ManyToOne;
import shop.pojo.Product;
import shop.pojo.base.BasePOJO;

public class ProductImageExtension extends BasePOJO {
    @ManyToOne
    @JoinColumn(name = "pid")
    private Product product;

    public enum Type{
        top,detail,cover;
    }
    public String getPath(){
        return getId()+".jpg";
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

