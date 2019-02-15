package org.effectivejava.examples.chapter12.item79;

/**
 * 这就是一个抽象类,就不能够实例化(创建对象)Animal animal = new Animal();不对。
 * @author zw
 * @date 2018/11/27
 */
abstract class Animal {
    private String name;
    private int age;

    /**
     * 动物会叫,当这个方法永远不会用到时我们把它做成抽象类,但子类一定用到
     * 抽象方法永远不能实现，要在子类中实现,抽象类可以没有抽象方法
     */
    abstract void cry();

    /**
     * 方法可以有方法体
     */
    final void see() {
        System.out.println("动物说！");
    }
}
