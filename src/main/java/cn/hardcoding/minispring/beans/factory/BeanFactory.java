package cn.hardcoding.minispring.beans.factory;

import cn.hardcoding.minispring.beans.BeansException;

/**
 * @ClassName BeanFactory
 * @Description 定义获取bean的方法
 * @Date 2022/11/12 17:37
 * @Author caoxuanhao
 */
public interface BeanFactory {

    /**
     * 通过名称获取bean对象
     *
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;

    /**
     * 通过实参获取bean对象实例
     *
     * @param name
     * @param args
     * @return
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param name              bean名称
     * @param requiredType      类型
     * @param <T>               泛型
     * @return                  实例化后的Bean对象
     * @throws BeansException   不能获取Bean对象时，抛出的异常
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
