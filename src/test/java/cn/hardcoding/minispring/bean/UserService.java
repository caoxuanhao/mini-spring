package cn.hardcoding.minispring.bean;

/**
 * @ClassName UserService
 * @Description 定义了一个bean，用于测试框架的基础功能
 * @Date 2022/11/12 16:54
 * @Author caoxuanhao
 */
public class UserService {

    private String name;

    public UserService() {

    }

    public UserService(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hi !");
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
