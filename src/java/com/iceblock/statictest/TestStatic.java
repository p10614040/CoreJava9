/**
 * @Title TestStatic.java
 * @Package com.corejava9.chapter.statictest
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年8月17日 上午9:28:24
 * @copyright USTCINFO
 */
package com.iceblock.statictest;

/**
 * @author YanLiang
 *
 */
public class TestStatic {

    int i = 0;
    static int j = 0;

    static {
        // int j = 1;
        System.out.println("j = " + j);
    }

    /**
     * @author yan.liang
     * @date 2015年8月17日 上午9:28:24
     * @Description 关于成员变量和局部变量
     * 运行时优先找最近的变量定义
     */
    public static void main(String[] args) {
        int j = 2;
        System.out.println("j = " + j);
        System.out.println("TestStatic.j = " + TestStatic.j);
    }

    public void test1() {
        int j = 3;
        int i = 1;
    }

}
