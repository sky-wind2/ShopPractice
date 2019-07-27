package shop.pojo.extension;

import shop.annotation.ORMAnnotation.JoinColumn;
import shop.annotation.ORMAnnotation.ManyToOne;
import shop.pojo.Category;
import shop.pojo.base.BasePOJO;

public class PropertyExtension extends BasePOJO {
    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
