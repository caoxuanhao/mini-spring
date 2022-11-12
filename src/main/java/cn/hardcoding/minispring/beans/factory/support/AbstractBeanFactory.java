package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.BeansException;
import cn.hardcoding.minispring.beans.factory.BeanFactory;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;

/**
 * @ClassName AbstractBeanFactory
 * @Description TODO
 * @Date 2022/11/12 17:45
 * @Author caoxuanhao
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * getBean方法先从缓存中获取Singleton对象实例，
     * 否则通过模板方法来创建一个Bean的实例。
     * @param name
     * @return
     */
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 获取Bean的定义
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建Bean的实例
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
