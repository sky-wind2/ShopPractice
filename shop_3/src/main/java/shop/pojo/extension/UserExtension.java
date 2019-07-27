package shop.pojo.extension;

import shop.annotation.ORMAnnotation.Enumerated;
import shop.pojo.base.BasePOJO;

public class UserExtension extends BasePOJO  {
    @Enumerated(var = "group_")
    private Group group;

    public Group getGroup(){
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public enum Group{
        unLogin,user,admin,superAdmin;
    }
}
