/*
 * (C)COPYRIGHT 2015, GUOCHUANG SOFTWARE ALL RIGHTS RESERVED.
 */

package com.iceblock.jvm;

/**
 * 虚拟机栈和本地方法栈 OOM 测试
 *
 * VM Args: -Xss2M
 *
 * @author YanLiang
 * @date 2015-12-29.
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    /*
     * 运行结果：
     * java.lang.OutOfMemoryError: unable to create new native thread
     */
    public static void main(String[] args) throws Throwable{
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
