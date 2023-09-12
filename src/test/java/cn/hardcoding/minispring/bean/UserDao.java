package cn.hardcoding.minispring.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Date 2022/11/13 13:06
 * @Author caoxuanhao
 */
public class UserDao {



    private static Map<String, String> userMap = new HashMap<>();

    static {
        userMap.put("10001", "小傅哥");
        userMap.put("10002", "八杯水");
        userMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return userMap.get(uId);
    }
}
