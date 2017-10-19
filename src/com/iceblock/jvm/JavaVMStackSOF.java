/*
 * (C)COPYRIGHT 2015, GUOCHUANG SOFTWARE ALL RIGHTS RESERVED.
 */

package com.iceblock.jvm;

/**
 * 虚拟机栈和本地方法栈 SOF 测试
 *
 * VM Args: -Xss128k
 *
 * @author YanLiang
 * @date 2015-12-29.
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void  stackLeak() {
        stackLength++;
        stackLeak();
    }

    /*
     * 运行结果：
     * Exception in thread "main" java.lang.StackOverflowError
     * stack length:1007
     */
    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
