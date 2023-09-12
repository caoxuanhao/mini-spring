package cn.hardcoding.minispring;

import cn.hardcoding.minispring.bean.UserDao;
import cn.hardcoding.minispring.bean.UserService;
import cn.hardcoding.minispring.beans.PropertyValue;
import cn.hardcoding.minispring.beans.PropertyValues;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;
import cn.hardcoding.minispring.beans.factory.config.BeanReference;
import cn.hardcoding.minispring.beans.factory.support.DefaultListableBeanFactory;
import cn.hardcoding.minispring.beans.factory.support.SimpleInstantiationStrategy;
import cn.hardcoding.minispring.beans.factory.xml.XmlBeanDefinitionReader;
import cn.hardcoding.minispring.core.io.DefaultResourceLoader;
import cn.hardcoding.minispring.core.io.Resource;
import cn.hutool.core.io.IoUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = new DefaultResourceLoader().getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testLoadBDFromXML(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String name = userService.queryUserName("10002");
        System.out.println(name);
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
