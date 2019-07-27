package shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.annotation.Auth;
import shop.pojo.User;

@Controller
@RequestMapping("/admin/")
public class RootController extends AdminBaseController {
    @Auth(User.Group.admin)
    @RequestMapping("/")
    public String root() {
        return "redirect:category/list";
    }
}
