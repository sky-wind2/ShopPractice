package shop.controller.admin;

import shop.annotation.Auth;
import shop.controller.BaseController;
import shop.pojo.User;

/**
 * Controller基类，定义权限
 */
@Auth(User.Group.superAdmin)
public class AdminBaseController extends BaseController {

}
