package shop.controller.front;

import shop.annotation.Auth;
import shop.controller.BaseController;
import shop.pojo.User;

@Auth(User.Group.unLogin)
public class FrontBaseController extends BaseController {

}
