package cn.hardcoding.minispring.beans;

/**
 * @ClassName PropertyValue
 * @Description Bean依赖的属性信息，数据模型
 * @Date 2022/11/13 12:49
 * @Author caoxuanhao
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
