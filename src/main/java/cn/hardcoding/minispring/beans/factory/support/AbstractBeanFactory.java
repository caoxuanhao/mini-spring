package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.BeansException;
import cn.hardcoding.minispring.beans.factory.BeanFactory;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;

/**
 * @ClassName AbstractBeanFactory
 * @Description 抽象的Bean工厂，实现了获取实例对象的方法
 * @Date 2022/11/12 17:45
 * @Author caoxuanhao
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * getBean方法先从缓存中获取Singleton对象实例，
     * 否则通过模板方法来创建一个Bean的实例。
     *
     * @param name
     * @return
     */
    @Override
    public Object getBean(String name) {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) {
        return doGetBean(name, args);
    }

    /**
     * 实际获取bean的方法
     *
     * @param name
     * @param args
     * @param <T>
     * @return
     */
    private <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    /**
     * 获取Bean的定义
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建Bean的实例
     *
     * @param beanName
     * @param beanDefinition
     * @param args
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object... args) throws BeansException;
}
