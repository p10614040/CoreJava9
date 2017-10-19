/**
 * @Title StaticFinal.java
 * @Package com.corejava9.chapter3
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月2日 下午9:14:21
 * @copyright USTCINFO
 */
package com.iceblock.chapter3;


import com.iceblock.chapter4.EmployeeTest;

/**
 * @author YanLiang
 *
 */
public class StaticFinal {

    /*
     * 下面两张方式
     * a可以在构造函数中初始化
     * b是静态变量，类没有实例化的时候就应该有了，必须在定义的时候或者静态块中初始化
     */
    private final int a;
    private static final int b;

    static {
        b = 2;
    }

    public StaticFinal() {
        this.a = 1;
    }

    /**
     * @author yan.liang
     * @date 2015年7月2日 下午9:14:21
     * @Description TODO(这里用一句话描述这个方法的作用)
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EmployeeTest test = new EmployeeTest();
    }

}
