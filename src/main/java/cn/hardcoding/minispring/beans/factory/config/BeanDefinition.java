package cn.hardcoding.minispring.beans.factory.config;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义类，用于描述Spring中Bean的信息
 * @Date 2022/11/12 16:49
 * @Author caoxuanhao
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
