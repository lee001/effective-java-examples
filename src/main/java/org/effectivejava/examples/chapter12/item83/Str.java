package org.effectivejava.examples.chapter12.item83;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author zw
 * @date 2019/1/10
 */
public class Str {
    public static void main(String[] args) {
        String str = "https://oss.suixingpay.com/callBill/20180412/03bf44e8aa594a73827826c5b6ea95a6/last/";

        System.out.println(str.replace("https://oss.suixingpay.com/callBill/", ""));

        try {
            Path p = Files.createTempFile("test", "");
            Files.createFile(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
