package cn.hardcoding.minispring;

import cn.hardcoding.minispring.bean.UserService;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description TODO
 * @Date 2022/11/12 16:58
 * @Author caoxuanhao
 */
public class ApiTest {

    private BeanFactory beanFactory;

    private final String beanName = "userService";

    @Before
    public void registerBean() {
        beanFactory = new BeanFactory();

        UserService userService = new UserService();
        BeanDefinition beanDefinition = new BeanDefinition(userService);
        beanFactory.registerBeanDefinition(beanName, beanDefinition);
    }

    @Test
    public void testGetBean () {
        UserService userService = (UserService) beanFactory.getBean(beanName);
        userService.sayHi();
    }
}
