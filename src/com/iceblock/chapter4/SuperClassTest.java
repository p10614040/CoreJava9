/**
 * @Title SuperClassTest.java
 * @Package com.corejava9.chapter4
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月13日 上午9:45:47
 * @copyright USTCINFO
 */
package com.iceblock.chapter4;

/**
 * @author YanLiang
 *
 */
public class SuperClassTest {


    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();

    }

}

class SuperClass {

    public SuperClass() {
        System.out.println("默认构造参数");
    }

}

class ChildClass extends SuperClass {

    /**
     *
     */
    public ChildClass() {
    }


}