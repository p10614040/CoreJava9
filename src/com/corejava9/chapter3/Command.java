/**
 * 
 * @Title Command.java
 * @Package com.corejava9.chapter3
 * @Description 命令行参数
 * @author yan.liang
 * @date 2015年7月1日 下午5:09:59
 * @copyright USTCINFO
 */
package com.corejava9.chapter3;

/**
 * @author YanLiang
 *
 */
public class Command {

	/**
	 * @author yan.liang
	 * @date 2015年7月1日 下午5:09:59
	 * @Description 带有命令参数的调试<br>
	 * 运行方式：java Command hello world
	 * 或者Run configurations...设置arguments
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		if("hello".equals(args[0])){
			System.out.println("input HELLO!");
		}
		
		if("world".equals(args[1])){
			System.out.println("input WORLD!");
		}

	}

}
