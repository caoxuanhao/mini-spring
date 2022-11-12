package cn.hardcoding.minispring;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义类，用于描述Spring中Bean的信息
 * @Date 2022/11/12 16:49
 * @Author caoxuanhao
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
