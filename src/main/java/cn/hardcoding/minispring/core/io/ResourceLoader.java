package cn.hardcoding.minispring.core.io;

/**
 * @author caoxuanhao
 * @description 资源加载器
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}