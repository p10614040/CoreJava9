/**
 * 
 * @Title IO.java
 * @Package com.corejava9.chapter3
 * @Description Java 输入输出
 * @author yan.liang
 * @date 2015年6月30日 下午8:44:11
 * @copyright USTCINFO
 */
package com.corejava9.chapter3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 * @author YanLiang
 *
 */
public class IO {

	/**
	 * @author yan.liang
	 * @date 2015年6月30日 下午8:44:11
	 * @Description IO测试
	 */
	public static void main(String[] args) {
		/*
		 * 使用集成环境时，启动路径由IDEA控制
		 * 可以使用System.getProperty("user.dir")获得路径
		 */
		showUserDir();
		fileIO();
		// outInTest();
		daliyLogIn();	// 写日志
	}
	

	/**
	 * @author yan.liang
	 * @date 2015年6月29日 下午5:41:13
	 * @Description 输入输出
	 */
	public static final void outInTest(){
		
		// 格式化输出
		System.out.printf("%tD %tr", new Date(), new Date());
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		
		System.out.println("What is your first name?");
		String firstName = scanner.next();
		System.out.println("firstName = " + firstName);
		scanner.nextLine();		// 跳到下一行
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("name = " + name);

		
		System.out.println("What is your company?");
		String company = scanner.nextLine();
		System.out.println("company = " + company);
		
	}


	/**
	 * @author yan.liang
	 * @date 2015年6月30日 下午8:56:14
	 * @Description 读取文件
	 */
	private static void fileIO() {
		// 读文件
		/*jdk 7 可以使用Paths
		Scanner fileIn = new Scanner(Paths.get("myfile.txt"));*/
		try {
			Scanner fileIn = new Scanner(new File("resources/myfile.txt"));
			while(fileIn.hasNext()){	// 按行读取
				System.out.println(fileIn.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// 写文件
		try {
			/*
			 * 是创建新文件
			 * new File("resources/myOutfile.txt") 会将文件截取为0
			 * new FileWriter("resources/myOutfile.txt") 也是覆盖
			 */
			PrintWriter pWriter = new PrintWriter("resources/myOutfile.txt");
			pWriter.print("这是通过");
			pWriter.print("PrintWriter");
			pWriter.println("写的内容，");
			pWriter.println("并且会覆盖原文件");
			pWriter.close();
			
			/*
			 * 无法完成写入
			 * pWriter.println("close之后写入的文件");
			 * pWriter.close();
			 */
			
			/*
			 * 这里是追加，不会覆盖原文件
			 */
			PrintWriter pWriter2 = new PrintWriter(new FileWriter("resources/myOutfile.txt", true));
			pWriter2.println("这是通过FileWriter追加的文件");
			pWriter2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @author yan.liang
	 * @date 2015年6月30日 下午9:22:11
	 * @Description 日志记录功能
	 */
	private static final void daliyLogIn(){
		try {
			PrintWriter pWriter = new PrintWriter(new FileWriter("resources/log.log", true));
			pWriter.println("开始写日志：");
			System.out.println("开始写日志：");
			while(true){
				Scanner inScanner = new Scanner(System.in);		// 从控制台读取
				String input = inScanner.nextLine();
				// 输入quit或者exit停止日志记录
				if("quit".equals(input) || "exit".equals(input)){
					System.out.println("日志结束！");
					break;
				}
				pWriter.println(input);
			}
			pWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * @author yan.liang
	 * @date 2015年6月30日 下午8:51:39
	 * @Description 显示用户路径
	 */
	private static void showUserDir() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	

}
