package cn.hardcoding.minispring.beans.factory.config;

/**
 * @ClassName BeanReference
 * @Description 引用属性定义
 * @Date 2022/11/13 12:59
 * @Author caoxuanhao
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
