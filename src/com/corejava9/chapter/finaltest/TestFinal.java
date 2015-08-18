/**
 * 
 * @Title TestFinal.java
 * @Package com.corejava9.chapter.finaltest
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年8月14日 下午4:08:48
 * @copyright USTCINFO
 */
package com.corejava9.chapter.finaltest;

/**
 * @author YanLiang
 *
 */
public class TestFinal {

	/**
	 * @author yan.liang
	 * @date 2015年8月14日 下午4:08:49
	 * @Description 测试final是否可以修改：结论，理解错误，只有String对象是不可修改，final类只是不可继承。
	 */
	public static void main(String[] args) {
		
		T t = new T();
		t.a = 1;
		
		System.out.println(t);
	}

}

final class T {
	
	int a = 0;
	String b = "1";
	
	@Override
	public String toString() {
		return "T [a=" + a + ", b=" + b + "]";
	}
	
}