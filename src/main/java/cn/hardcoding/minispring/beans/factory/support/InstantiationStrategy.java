package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.BeansException;
import cn.hardcoding.minispring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @ClassName InstantiationStrategy
 * @Description 实例化对象策略
 * @Date 2022/11/12 22:32
 * @Author caoxuanhao
 */
public interface InstantiationStrategy {

    /**
     * 实例化对象
     * @param beanDefinition
     * @param beanName
     * @param constructor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
