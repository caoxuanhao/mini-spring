package cn.hardcoding.minispring.beans.factory.support;

import cn.hardcoding.minispring.core.io.DefaultResourceLoader;
import cn.hardcoding.minispring.core.io.ResourceLoader;

/**
 * @ClassName AbstractBeanDefinitionReader
 * @Description TODO
 * @Date 2023/9/12 21:44
 * @Author caoxuanhao
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
