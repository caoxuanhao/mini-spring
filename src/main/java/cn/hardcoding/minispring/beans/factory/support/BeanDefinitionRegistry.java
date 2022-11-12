package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description BeanDefinition 注册表
 * @Date 2022/11/12 17:44
 * @Author caoxuanhao
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册bean定义
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
