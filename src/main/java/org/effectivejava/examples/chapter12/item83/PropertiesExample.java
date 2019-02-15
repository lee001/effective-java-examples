package org.effectivejava.examples.chapter12.item83;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author zw
 * @date 2018/11/27
 */
public class PropertiesExample {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        Enumeration en = p.keys();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            String val = p.getProperty(key);
            System.out.println(("key: " + key + " val: " + val));
        }
    }
}
