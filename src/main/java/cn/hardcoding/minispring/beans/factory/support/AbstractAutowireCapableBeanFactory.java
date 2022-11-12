package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.BeansException;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;

/**
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description TODO
 * @Date 2022/11/12 17:52
 * @Author caoxuanhao
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    /**
     * 创建一个bean实例对象，并将其注册到单例注册表
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }
}
