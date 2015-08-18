/**
 * 
 * @Title ReflectionNewInstance.java
 * @Package com.corejava9.chapter.classLoader
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年8月13日 下午8:41:30
 * @copyright USTCINFO
 */
package com.corejava9.chapter.classLoader;

import static java.lang.System.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * @author YanLiang
 *
 */
public class ReflectionNewInstance {

	/**
	 * @author yan.liang
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @date 2015年8月13日 下午8:41:31
	 * @Description 通过反射创建对象并调用方法
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*已知一个类名为T的对象，调用其方法m1和m2*/
		String className = "com.corejava9.chapter.classLoader.T";
		String methodName1 = "m1";
		String methodName2 = "m2";
		
		/*加载类并且执行类中的静态方法*/
		Class c = Class.forName(className);
		/*创建对象，执行构造器中的块语句*/
		Object o = c.newInstance();
		/*获得类中的方法*/
		Method[] methods = c.getMethods();
		/*调用其中的两个方法*/
		for (Method method : methods) {
			if(method.getName().equals(methodName1)) {
				/*通过反射获取参数的类型*/
				System.out.println(method.getReturnType().getName());;
				Object v = method.invoke(o);
				System.out.println("通过反射调用对象的方法获得的值：" + v);
			}
			
			if(method.getName().equals(methodName2)) {
				method.invoke(o, 1, 2);
			}
		}
	}

}


class T {
	
	private int i;
	private String s;
	
	static {
		out.println("I am static block！");
	}

	/**
	 * 构造器
	 */
	public T() {
		System.out.println("I am constructor!");
	}
	
	public String m1() {
		System.out.println("I am m1 method!");
		return "m1";
	}
	
	public void m2(int i, int j) {
		System.out.println("I am m2 method! i + j " + (i + j));
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}