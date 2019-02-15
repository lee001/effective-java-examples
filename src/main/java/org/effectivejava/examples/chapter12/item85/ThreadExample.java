package org.effectivejava.examples.chapter12.item85;

/**
 * @author zw
 * @date 2018/11/27
 */
public class ThreadExample {
    /*public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ok1");
            }
        }).start();


        //jdk8 lambda
        new Thread(()-> System.out.println("ok2")).start();

    }*/


    //重构
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok1");
            }
        };
        new Thread(target).start();


        //jdk8 lambda
        Runnable target1 = () -> System.out.println("ok2");
        new Thread(target1).start();

    }
}
