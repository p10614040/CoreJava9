/**
 * @Title ArrayListTest.java
 * @Package com.corejava9.chapter5
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月9日 下午5:38:26
 * @copyright USTCINFO
 */
package com.iceblock.chapter5;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author YanLiang
 *
 */
public class ArrayListTest {

    /**
     * @Fields ADD_COUNT : 循环的次数
     */
    private static final int ADD_COUNT = (int) Math.pow(2, 21);

    /**
     * @author yan.liang
     * @date 2015年7月9日 下午5:38:26
     * @Description 测试 ensureCapacity 提高性能的效果
     */
    public static void main(String[] args) {
        test1();
        test2();

        /**
         * 输出： 307 139 结论：使用了ensureCapacity，同样次数的 add 操作，时间缩短了一倍以上
         */

    }

    /**
     * @author yan.liang
     * @date 2015年7月9日 下午5:40:20
     * @Description 不使用ensureCapacity添加
     */
    private static final void test1() {

        Date startDate = new Date();
        // ! 泛型中不能存放基本类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ADD_COUNT; i++) {
            list.add(i);
        }
        Date endDate = new Date();
        System.out.println((endDate.getTime() - startDate.getTime()));
    }

    /**
     * @author yan.liang
     * @date 2015年7月9日 下午5:49:21
     * @Description 使用ensureCapacity添加
     */
    private static final void test2() {

        Date startDate = new Date();
        // ! 泛型中不能存放基本类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(ADD_COUNT);
        for (int i = 0; i < ADD_COUNT; i++) {
            list.add(i);
        }
        Date endDate = new Date();
        System.out.println((endDate.getTime() - startDate.getTime()));
    }
}
