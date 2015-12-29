/**
 * @Title Array.java
 * @Package com.corejava9.chapter3
 * @Description 数组
 * @author yan.liang
 * @date 2015年7月1日 下午4:22:30
 * @copyright USTCINFO
 */
package java.corejava9.chapter3;

import java.util.Arrays;

/**
 * @author YanLiang
 *
 */
public class Array {

    /**
     * @author yan.liang
     * @date 2015年7月1日 下午4:22:30
     * @Description Array
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {

		/*
		 * 声明数组
		 * 两种方式，第一种方式更好，它表示“整型数组类型”
		 */
        int[] a;
        String b[];

		/*
		 * 数组创建
		 * 数组长度可以是变量
		 * 注意：
		 * 1、数组定义之后不能再修改大小；
		 * 2、数组创建之后所有元素都会初始化，int是0,boolean是false,对象是null
		 */
        a = new int[100];
        int i = 100;
        b = new String[i];
        System.out.println(a[10]);        // 输出 0
        System.out.println(b[10]);        // 输出 null
		
		/*
		 * 数组初始化
		 */
        int[] c = {1, 2, 3, 4, 5, 6};
		
		/*
		 * 匿名数组
		 */
        c = new int[]{1, 2, 3, 4, 5, 7};
        System.out.println(c[5]);
		
		/*
		 * 数组拷贝
		 * 这里是对象引用的拷贝，修改会修改原来的对象
		 */
        int[] d = c;
        d[0] = 10;
        System.out.println(c[0]);
		
		/*
		 * 真实拷贝Arrays.copyOf，超过原始数组长度的会自动初始化，小于的会截断
		 * 这个方法通常可以用来修改数组的大小
		 */
        int[] e1 = Arrays.copyOf(d, d.length);
        int[] e2 = Arrays.copyOf(d, d.length - 1);
        int[] e3 = Arrays.copyOf(d, d.length * 2);
		/*
		 * 对象传参传的是对象的引用
		 * 其中基本类型，String,Interger,Boolean,Double等都不会受影响
		 */
        changeObject(d);
        System.out.println(d[1]);
		
		/*
		 * 排序，并打印数组里所有值
		 */
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
    }


    /*
     * 修改值测试
     */
    private final static void changeObject(int[] objects) {
        objects[1] = 11;
    }

}
