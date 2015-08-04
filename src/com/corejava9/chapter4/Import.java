/**
 * 
 * @Title Import.java
 * @Package com.corejava9.chapter4
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月3日 下午4:16:24
 * @copyright USTCINFO
 */
package com.corejava9.chapter4;

// 静态导入：导入静态方法和静态域
import static java.lang.System.*;

/**
 * @author YanLiang
 *
 */
public class Import {

	/**
	 * @author yan.liang
	 * @date 2015年7月3日 下午4:16:24
	 * @Description TODO(这里用一句话描述这个方法的作用)
	 */
	public static void main(String[] args) {
		out.println("这是静态导入提供的方法");
		
		Employ employ = new Employ(1, "2");
		EmployeeTest test = new EmployeeTest();
		test.testPrivate();
	}

}
