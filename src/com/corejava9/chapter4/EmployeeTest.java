/**
 * 
 * @Title EmployeeTest.java
 * @Package com.corejava9.chapter4
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月2日 下午5:10:26
 * @copyright USTCINFO
 */
package com.corejava9.chapter4;

import java.text.NumberFormat;
import java.util.Date;

/**
 * @author YanLiang
 * 自定义类<br>
 * 源文件名必须与public类名称相同，且只有一个<br>
 * 编译之后会出现两个.class文件 EmployeeTest.class 和 Employ.class<br>
 * 编译时可以使用 javac Employ*.java 通配符编译<br>
 * 如果只编译了 EmployeeTest 类，在运行的时候会自动查找 Employ 并进行编译<br>
 */
public class EmployeeTest {

	/**
	 * @author yan.liang
	 * @date 2015年7月2日 下午5:10:26
	 * @Description 
	 */
	public static void main(String[] args) {
		
		/*
		 * 定义3个雇员
		 */
		Employ[] employs = new Employ[3];
		employs[0] = new Employ(1000, "ZhangSan");
		employs[1] = new Employ(1000, "LiSi");
		employs[2] = new Employ(1000, "WangWu");
		
		// ZhangSan 涨100
		employs[0].riseSalary(100);
		// Lisi 减100
		employs[1].riseSalary(-100);
		
		for (Employ employ : employs) {
			System.out.println(employ.toString());
			employ.setNextId();
			System.out.println(employ.getNextId());
		}
		/*
		 * NumberFormat使用了工厂方法，
		 * 工厂方法可以返回不是本对象类型的对象
		 */
		
		/*
		 * 测试可变对象引用
		 */
		Date ZSDate = employs[0].getDate();
		System.out.println(employs[0].getDate().getTime());
		ZSDate.setTime(new Date().getTime() - 1 * 24 * 60 * 60 * 1000);
		System.out.println(employs[0].getDate().getTime());		// date是私有对象，但是这里却被修改了
	}
	
	/*
	 * 测试调用情况：
	 * 如果一个方法没有定义Public 或者 Private，那么只有同一包中的类可以访问
	 * 定义了public则所有都可以访问
	 * 定义了private则只有当前类可以访问
	 */
	void testPrivate(){
		
	}

}

/**
 * 
 * @author YanLiang
 * 雇员类
 */
class Employ {
	/*
	 * private 确保只有类自身可以访问
	 */
	private static int salary;
	private String name;
	private Date date;
	private static int nextId;	// 静态域，对象只有一个静态域，所有实例共享，静态变量比较少，一般是静态常量
	/*
	 * 静态方法：可以访问静态域，没有隐式参数，没有this关键字的方法
	 * 设计静态方法的条件：不需要访问对象状态；只需访问静态资源；
	 */
	
	/*
	 * 初始化
	 * 1、静态初始化块只能初始化静态方法
	 */
	static {
		salary = 100;
	}
	
	/*
	 * 实例初始化块会在对象创建时初始化
	 */
	{
		name = "defaultName";
	}
	
	/**
	 * 注意！这不是好的设计原则<br>
	 * 返回了可变对象的引用<br>
	 * 如果修改了这个对象，那所有的引用都会修改<br>
	 * 但是基本类型不会，是直接修改值<br>
	 * String是不可变对象
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @return the nextId
	 */
	public int getNextId() {
		return nextId;
	}


	/**
	 * @param nextId the nextId to set
	 */
	public void setNextId() {
		Employ.nextId++;
	}


	/**
	 * @param salary
	 * @param name
	 */
	public Employ(int salary, String name) {
		this.salary = salary;
		this.name = name;
		this.date = new Date();
	}


	public void riseSalary(int addSalary){
		/*
		 * 使用 this 可以明显的区分局部变量和实例域
		 */
		this.salary = this.salary + addSalary;
	}
	
	/* 
	 * Description: 
	 */
	@Override
	public String toString() {
		return "Employ [name=" + name + ", date=" + date + "]";
	}


	/**
	 * @return the salary
	 */
	public static int getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public static void setSalary(int salary) {
		Employ.salary = salary;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
