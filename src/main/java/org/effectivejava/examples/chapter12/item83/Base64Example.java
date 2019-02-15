package org.effectivejava.examples.chapter12.item83;

import org.apache.commons.codec.binary.Base64;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Base64Example {
    public static void main(String[] args) {

        System.out.print("解密: " + new String(new Base64().decode("E155CDA48299FC7158C3075F88196BCD")));
        
        System.out.print("解密: " + new String(new Base64().encode("123456".getBytes())));

    }
}
