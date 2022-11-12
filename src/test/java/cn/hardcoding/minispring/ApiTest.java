package cn.hardcoding.minispring;

import cn.hardcoding.minispring.bean.UserService;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;
import cn.hardcoding.minispring.beans.factory.support.CglibSubclassingInstantiationStrategy;
import cn.hardcoding.minispring.beans.factory.support.DefaultListableBeanFactory;
import cn.hardcoding.minispring.beans.factory.support.InstantiationStrategy;
import cn.hardcoding.minispring.beans.factory.support.SimpleInstantiationStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description TODO
 * @Date 2022/11/12 16:58
 * @Author caoxuanhao
 */
public class ApiTest {

    private DefaultListableBeanFactory beanFactory;
    private final String beanName = "userService";

    @Before
    public void registerBean() {
        beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(beanName, beanDefinition);
    }

    @Test
    public void testGetBean() {
        UserService userService = (UserService) beanFactory.getBean(beanName);
        userService.sayHi();
    }

    @Test
    public void testSingleton() {
        UserService userService = (UserService) beanFactory.getBean(beanName);
        UserService userService1 = (UserService) beanFactory.getBean(beanName);
        Assert.assertEquals(userService, userService1);
    }

    @Test
    public void testGetBeanWithParams() {
        UserService bean = (UserService)beanFactory.getBean(beanName, "刘伯温");
        System.out.println(bean);
    }

    @Test
    public void testGetBeanWithParamsByJDK() {
        beanFactory.setInstantiationStrategy(new SimpleInstantiationStrategy());
        UserService bean = (UserService)beanFactory.getBean(beanName, "朱元璋");
        System.out.println(bean);
    }
}
