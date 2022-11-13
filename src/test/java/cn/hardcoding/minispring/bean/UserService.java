package cn.hardcoding.minispring.bean;

/**
 * @ClassName UserService
 * @Description 定义了一个bean，用于测试框架的基础功能
 * @Date 2022/11/12 16:54
 * @Author caoxuanhao
 */
public class UserService {

    private UserDao userDao;
    private String name;
    private String uId;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public UserService() {

    }

    public UserService(String name) {
        this.name = name;
    }

    public UserService(String name, String uId) {
        this.name = name;
        this.uId = uId;
    }

    public String queryUserName(String uId) {
        uId = uId == null ? this.uId : uId;
        return this.userDao.queryUserName(uId);
    }

    public void sayHi() {
        System.out.println("Hi !");
    }


    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", uId='" + uId + '\'' +
                '}';
    }
}
