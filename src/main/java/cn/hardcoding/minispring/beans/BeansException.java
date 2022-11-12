package cn.hardcoding.minispring.beans;

/**
 * @ClassName BeansException
 * @Description bean 异常
 * @Date 2022/11/12 17:36
 * @Author caoxuanhao
 */
public class BeansException extends RuntimeException{
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
