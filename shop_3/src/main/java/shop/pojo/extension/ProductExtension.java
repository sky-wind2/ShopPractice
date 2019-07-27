package shop.pojo.extension;

import java.util.List;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.ManyToOne;
import shop.annotation.ORMAnnotation.OneToMany;
import shop.pojo.Category;
import shop.pojo.ProductImage;
import shop.pojo.base.BasePOJO;

public class ProductExtension extends BasePOJO {

    @ManyToOne
    @JoinColumn(name = "cid")
    private Category category;

    @ManyToOne
    @JoinColumn(name="imgid")
    private ProductImage image;
    @OneToMany
    @JoinColumn(name="pid")
    private List<ProductImage> productImages;

    public ProductImage getImage() {
        return image;
    }

    public void setImage(ProductImage image) {
        this.image = image;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
