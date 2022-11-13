package cn.hardcoding.minispring;

import cn.hardcoding.minispring.bean.UserDao;
import cn.hardcoding.minispring.bean.UserService;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;
import cn.hardcoding.minispring.beans.factory.config.BeanReference;
import cn.hardcoding.minispring.beans.factory.support.DefaultListableBeanFactory;
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
        UserService bean = (UserService) beanFactory.getBean(beanName, "刘伯温");
        System.out.println(bean);
    }

    @Test
    public void testGetBeanWithParamsByJDK() {
        beanFactory.setInstantiationStrategy(new SimpleInstantiationStrategy());
        UserService bean = (UserService) beanFactory.getBean(beanName, "朱元璋");
        System.out.println(bean);
    }

    @Test
    public void testSetProperty() {
        beanFactory.setInstantiationStrategy(new SimpleInstantiationStrategy());

        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        BeanDefinition usbd = new BeanDefinition(UserService.class);
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10003"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        usbd.setPropertyValues(propertyValues);
        beanFactory.registerBeanDefinition(beanName, usbd);

        UserService userService = (UserService) beanFactory.getBean(beanName);
        System.out.println(userService.queryUserName(null));
    }
}
