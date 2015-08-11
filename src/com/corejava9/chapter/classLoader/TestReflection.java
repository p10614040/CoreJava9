/**
 * 
 */
package com.corejava9.chapter.classLoader;

/**
 * @author YanLiang
 *
 */
public class TestReflection {

	/**
	 * @author yan.liang
	 * @date 2015年8月10日 下午9:37:29
	 * @Description 测试类是依次加载，而不是全部加载
	 *              <p>
	 *              类按顺序加载<br>
	 *              类只加载一次<br>
	 *              static块只加载一次<br>
	 */
	public static void main(String[] args) {
		new A();
		System.out.println("this is between A and B....");
		new B();

		new C();
		new C();

		new D();
		new D();

	}

}

class A {

}

class B {

}

class C {
	static {
		System.out.println("this is c....");
	}
}

class D {
	{
		System.out.println("this is d...");
	}
}