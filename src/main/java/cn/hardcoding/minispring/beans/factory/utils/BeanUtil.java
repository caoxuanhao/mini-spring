package cn.hardcoding.minispring.beans.factory.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName BeanUtil
 * @Description Bean工具类
 * @Date 2022/11/13 13:01
 * @Author caoxuanhao
 */
public class BeanUtil {

    public static void setFieldValue(Object bean, String name, Object value) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> clazz = bean.getClass();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        Method method = clazz.getDeclaredMethod("set" + name, value.getClass());
        method.invoke(bean, value);
    }
}
