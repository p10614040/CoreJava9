/**
 * 
 * @Title StreamMainTest.java
 * @Package com.corejava9.chapter.io
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月21日 下午4:05:28
 * @copyright USTCINFO
 */
package com.corejava9.chapter.io;

/**
 * @author YanLiang
 *
 */
public class StreamMainTest {

	/**
	 * @author yan.liang
	 * @date 2015年7月21日 下午4:05:28
	 * @Description TODO(这里用一句话描述这个方法的作用)
	 */
	public static void main(String[] args) {
		// 运行目录
		System.out.println(System.getProperty("user.dir"));
		// 运行环境分割字符
		System.out.println(java.io.File.separator);
		// 换行
		System.out.println(System.getProperty("line.separator"));
	}

}
