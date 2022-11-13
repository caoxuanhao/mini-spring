package cn.hardcoding.minispring.beans.factory.config;

import cn.hardcoding.minispring.PropertyValues;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义类，用于描述Spring中Bean的信息
 * @Date 2022/11/12 16:49
 * @Author caoxuanhao
 */
public class BeanDefinition {

    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
