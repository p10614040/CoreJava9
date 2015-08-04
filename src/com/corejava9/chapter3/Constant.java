/**
 * 
 * @Title Constant.java
 * @Package com.corejava9.chapter3
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年6月27日 下午5:54:55
 * @copyright USTCINFO
 * @USTCINFO yan
 */
package com.corejava9.chapter3;

import java.util.Date;

/**
 * @author YanLiang
 * final 声明的变量不可修改<br>
 * final 声明的方法不可继承<br>
 * final 声明的类不可继承<br>
 * <br>
 * final 声明的变量JVM会进行缓存，提高了性能<br>
 * fianl 声明的变量可以安全的在多线程环境下运行<br>
 * final 声明的变量和方法JVM会对其进行优化<br>
 */
public class Constant {

	/* 
	 * final的常量不允许修改，初始化方法有3个：
	 * 1、声明的时候初始化
	 * 2、构造函数中初始化
	 * 3、初如化代码块中{} 或者　static{}中初始化
	 */
	public static final String CONS_STR = "常量";
	private static String test1;
	private static int test2;
	private static final long test3;	// final 必须显示初始化
	static {
		test3 = 3l;
	}

	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午5:54:55
	 * @Description 常量
	 */
	public static void main(String[] args) {
		
		/*
		 * 全局变量会在定义的时候初始化
		 */
		System.out.println(test1);
		System.out.println(test2);
		
		/*
		 * 局部变量不会自动初始化，所以这里会报错
		 */
		/*char a;
		System.out.println(a);*/

		/* 下面的代码编译时会报错 */
		/* CONS_STR = "1"; */

		// 测试fianl方法性能
		/*final int num = 1000000;
		Date startDate = new Date();
		for (int i = 0; i < num; i++) {
			funTestFinal();
		}
		Date endDate = new Date();
		System.out.println((startDate.getTime() - endDate.getTime()) / 1000);

		Date startDate1 = new Date();
		for (int i = 0; i < num; i++) {
			funTest();
		}
		Date endDate1 = new Date();
		System.out.println((startDate.getTime() - endDate.getTime()) / 1000);
		System.out.println((startDate1.getTime() - endDate1.getTime()) / 1000);*/
		
		Long a = 0L;
		
		int b = 0;
		Long c = (long) b;
		
		byte b1 = 1;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;
		float f1 = l1;
		char c1 = 'a';
		double d1 = f1;
	}

	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午5:57:27
	 * @Description 不允许继承的方法，性能也更好
	 */
	public static final void funTestFinal() {
		String str = "a" + "b";
		System.out.println(str);
	}

	public static void funTest() {
		String str = "a" + "b";
		System.out.println(str);
	}
}
