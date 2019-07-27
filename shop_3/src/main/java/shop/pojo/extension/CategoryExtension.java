package shop.pojo.extension;

import java.util.List;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.OneToMany;
import shop.pojo.Product;
import shop.pojo.base.BasePOJO;

public class CategoryExtension extends BasePOJO {
    @OneToMany
    @JoinColumn(name = "cid")
    private List<Product> products;


    public String getImgPath() {
        return getId() + ".jpg";
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}