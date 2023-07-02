package com.entropy.util;

//import sun.misc.BASE64Encoder; 这个包是非公开的，其目的是为了支持内部的sun.misc套件，但是在java9及以上版本中已经被移除了
import java.util.Base64; //java9及以上版本中推荐使用的替代方案

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncodeUtil {
    public static String getFilename(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            //IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");

            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            //Firefox浏览器
//            BASE64Encoder base64Encoder = new BASE64Encoder();

            Base64.Encoder base64Encoder = Base64.getEncoder();

            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
        } else {
            //其他浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
