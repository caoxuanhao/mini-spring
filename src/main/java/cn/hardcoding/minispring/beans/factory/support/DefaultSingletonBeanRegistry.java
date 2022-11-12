package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DefaultSingletonBeanRegistry
 * @Description TODO
 * @Date 2022/11/12 17:46
 * @Author caoxuanhao
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public void registerSingleton(String name, Object singletonObject) {
        singletonObjects.put(name, singletonObject);
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
}
