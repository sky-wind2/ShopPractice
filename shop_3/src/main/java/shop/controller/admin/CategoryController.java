package shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.annotation.Auth;
import shop.annotation.Nullable;
import shop.pojo.Category;
import shop.pojo.User;
import shop.util.Pagination;
import shop.util.UploadedImageFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/category")		///SpringMVC 将其请求路径映射部分放到类级别上
public class CategoryController extends AdminBaseController {
    @Auth(User.Group.admin)
    @RequestMapping("list")
    public String list(Model model, Pagination pagination) throws Exception {
        List<Category> categories = categoryService.	///catageoryService 接口
                list("pagination", pagination, "order", "recommend desc, id desc");
        model.addAttribute("categories", categories); ///we simply add this data to its Model object.字符串与html中的text="${message}"映射取值
        return "admin/listCategory"; ///返回.jsp文件
    }

    @RequestMapping("add")
    public String add(String name, Integer recommend,
                      UploadedImageFile uploadedImageFile) throws Exception {
        Category c = new Category();
        c.setName(name);
        c.setRecommend(recommend);
        categoryService.add(c);
        fileUtil.saveImg(uploadedImageFile, "category", c.getId() + ".jpg");
        return "redirect:list";		///本类方法与方法进行重定向
    }

    @Auth(User.Group.admin)
    @RequestMapping("edit")
    public String edit(Integer id, Model model) throws Exception {
        Category category = (Category) categoryService.get(id);
        model.addAttribute(category);
        return "admin/editCategory";
    }

    @RequestMapping("update")
    public String update(Integer id, String name, Integer recommend,
                         @Nullable UploadedImageFile uploadedImageFile, HttpSession session) throws Exception {
        Category c = (Category) categoryService.get(id);
        c.setRecommend(recommend);
        c.setName(name);
        categoryService.update(c);
        if (uploadedImageFile.getImage().getSize() > 0) {
            fileUtil.saveImg(uploadedImageFile, "category", c.getId() + ".jpg");
        }
        //清空搜索栏下的cs缓存
        session.removeAttribute("cs");  ///session: session ID，根据ID在内存中找到之前创建的session对象，提供给请求使用。 
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(Integer id, HttpSession session) throws Exception {
        categoryService.delete(categoryService.get(id));
        session.removeAttribute("cs");
        return "redirect:list";
    }
}