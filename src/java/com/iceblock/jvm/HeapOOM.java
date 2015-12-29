/*
 * (C)COPYRIGHT 2015, GUOCHUANG SOFTWARE ALL RIGHTS RESERVED.
 */

package com.iceblock.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 堆溢出测试：java.lang.OutOfMemoryError: Java heap space
 * <p/>
 * VM Args: -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author YanLiang
 * @date 2015-12-29.
 */
public class HeapOOM {

    static class OOMObject {

    }

    /*
     * 运行结果：
     * java.lang.OutOfMemoryError: Java heap space
     * Dumping heap to java_pid14672.hprof ...
     * Heap dump file created [15965637 bytes in 0.144 secs]
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        int i = 0;
        while (true) {
            System.out.println(i++);
            list.add(new OOMObject());
        }
    }
}
