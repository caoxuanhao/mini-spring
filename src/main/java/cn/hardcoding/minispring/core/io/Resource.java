package cn.hardcoding.minispring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author caoxuanhao
 * @description
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}