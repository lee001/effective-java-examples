package org.effectivejava.examples.chapter12.item81;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("汪汪叫！");
    }

    //不能缩小父类的访问权限
//	protected void cry(){
//		System.out.println("汪汪叫！");
//	}
}
