package cn.hardcoding.minispring.beans.factory;

import cn.hardcoding.minispring.beans.BeansException;
import cn.hardcoding.minispring.beans.factory.config.AutowireCapableBeanFactory;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;
import cn.hardcoding.minispring.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author caoxuanhao
 * @description
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}