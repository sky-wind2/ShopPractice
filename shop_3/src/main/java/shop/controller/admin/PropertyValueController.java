package shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.annotation.Auth;
import shop.pojo.Product;
import shop.pojo.PropertyValue;
import shop.pojo.User;

import java.util.List;

@Controller
@RequestMapping("/admin/product/propertyValue")
public class PropertyValueController extends AdminBaseController {
    @Auth(User.Group.admin)
    @RequestMapping("edit")
    public String edit(Integer pid, Model model) throws Exception {
        Product product = (Product) productService.get(pid);
        propertyValueService.init(product);
        List<PropertyValue> propertyValues = propertyValueService.list("pid", pid);
        model.addAttribute("propertyValues", propertyValues);
        model.addAttribute("product", product);
        return "admin/editPropertyValue";
    }

    @RequestMapping("update")
    public String update(Integer pid, Integer[] id, String[] value) throws Exception {
        propertyValueService.update(id, value, "value");
        return "redirect:edit?pid=" + pid;
    }

}