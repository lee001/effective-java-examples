package org.effectivejava.examples.chapter12.item86;

import java.io.File;
import java.io.FileFilter;

/**
 * @author zw
 * @date 2018/11/27
 */
public class DelSvn {
    public static int count = 0;

    public static void main(String[] args) {
        File file = new File("D:/aaa/");
        if (file.exists()) {
            deleteSvn(file);
            System.out.println("执行成功！在  '" + file.getAbsolutePath() + "'  中共删除了 - " + count + " - 个.svn文件夹");
        } else {
            System.out.println("文件不存在！");
        }
    }

    public static void deleteSvn(File file) {
        File[] dirs = file.listFiles(new FileSvnFilter());
        for (File f : dirs) {
            if (".svn".equals(f.getName())) {
                deleteDir(f);
                count++;
            } else {
                deleteSvn(f);
            }
        }
    }

    public static void deleteDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                deleteDir(f);
                f.delete();
            } else {
                f.delete();
            }
        }
        file.delete();
    }
}

class FileSvnFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }
}