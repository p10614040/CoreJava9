/**
 * 
 * @Title Compare.java
 * @Package com.corejava9.chapter3
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月2日 下午7:56:15
 * @copyright USTCINFO
 */
package com.corejava9.chapter3;

/**
 * @author YanLiang
 *
 */
public class Compare {

	/**
	 * @author yan.liang
	 * @date 2015年7月2日 下午7:56:16
	 * @Description 相等比较
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Integer与Long封装类型的变量能直接比较的原因是，
		 * 这两个变量比较时，内部自动转化为值比较，即基本类型比较了
		 */
		Long l1 = 1l;
		Long l2 = 1l;
		System.out.println(l1 == l2);		// true
		
		Long l3 = new Long(1);
		Long l4 = new Long(1);
		System.out.println(l3 == l4);		// false
		System.out.println("l3 == l1 : " + (l3 == l1));	// false
		System.out.println("l3.equals(l1) : " + (l3.equals(l1)));	// true
		
		System.out.println(l3.compareTo(l4)); // 0
		System.out.println(l3.equals(l4));  // true
		System.out.println(l3.longValue() == l4.longValue());  // ture
		
		Long l5 = l3;
		System.out.println("l5 == l1 :" + (l5 == l1));
		System.out.println("l5 == l3 :" + (l5 == l3));
		
		/* 自动拆装箱 */
		Long l6 = 200L;
		Long l7 = 200L;
		Long l8 = 400L;
		System.out.println("l7 == l6 :" + (l7 == l6));		// false
		System.out.println("l7+1 == l6+1 :" + (l7+1 == l6+1));		// true
		System.out.println("l8 == (l7+l6) :" + (l8 == (l7+l6)));	// true
		
		
		/*
		 * Double与Float封装类型的变量
		 * 比较大小时，必须要转化为double基本类型,
		 * 与float基本类型比较，这样才是比较值的大小；
		 */
		Double d1 = 2d;
		Double d2 = 2d;
		System.out.println(d1 == d2); 	// false
		System.out.println(d1.equals(d2));	// true
		
		test2();

	}
	
	
	public static void test2(){
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;
		Long h = 2L;
		
		System.out.println(c==d);
		System.out.println(e==f);
		System.out.println(c==(a+b));
		System.out.println(c.equals(a+b));
		System.out.println(g==(a+b));
		System.out.println(g.equals(a+b));
		System.out.println(g.equals(a+h));
	}

}
