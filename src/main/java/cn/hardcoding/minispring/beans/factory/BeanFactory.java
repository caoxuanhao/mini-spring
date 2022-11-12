package cn.hardcoding.minispring.beans.factory;

/**
 * @ClassName BeanFactory
 * @Description 定义获取bean的方法
 * @Date 2022/11/12 17:37
 * @Author caoxuanhao
 */
public interface BeanFactory {

    /**
     * 通过名称获取bean对象
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 通过实参获取bean对象实例
     * @param name
     * @param args
     * @return
     */
    Object getBean(String name, Object... args);

}
