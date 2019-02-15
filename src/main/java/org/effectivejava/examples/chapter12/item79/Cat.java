package org.effectivejava.examples.chapter12.item79;

/**
 * 当一个类继承的父类是抽象类的话，需要我们把抽象类中的所有抽象方法全部实现
 * @author zw
 * @date 2018/11/27
 */
public class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("猫猫叫！");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();
        animal.see();
    }
}
