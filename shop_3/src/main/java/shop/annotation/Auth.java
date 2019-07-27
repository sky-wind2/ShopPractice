package shop.annotation;
import java.lang.annotation.*;

import shop.pojo.User;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * 鉴权
 * 加在 类 或 方法 上面，指定最低的用户权限的用户组，低于此用户组不能调用
 * 方法上面的配置会覆盖类上面的配置，类已经配置可不必配置方法
 */

@Retention(RetentionPolicy.RUNTIME) /// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({METHOD,TYPE}) ///注解的作用目标：接口、类、枚举、注解、方法
@Inherited ///：说明子类可以继承父类中的该注解
public @interface Auth {   ///注解类
    User.Group value();
}
