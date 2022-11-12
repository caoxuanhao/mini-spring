package cn.hardcoding.minispring.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description 单例Bean注册表
 * @Date 2022/11/12 17:41
 * @Author caoxuanhao
 */
public interface SingletonBeanRegistry {

    /**
     * 注册单例对象
     * @param name
     * @param singletonObject
     */
    void registerSingleton(String name, Object singletonObject);

    /**
     * 根据名称获取注册的单例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
