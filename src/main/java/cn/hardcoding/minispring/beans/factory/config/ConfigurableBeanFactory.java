package cn.hardcoding.minispring.beans.factory.config;

import cn.hardcoding.minispring.beans.factory.HierarchicalBeanFactory;

/**
 * @author caoxuanhao
 * @description
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
