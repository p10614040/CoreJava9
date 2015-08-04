/**
 * 
 * @Title PrimitiveType.java
 * @Package com.corejava9.chapter3
 * @Description Java基本类型
 * @author yan.liang
 * @date 2015年6月27日 下午4:55:55
 * @copyright USTCINFO
 */
package com.corejava9.chapter3;

/**
 * @author YanLiang
 * @Description Java有8种基本类型，其中：<br>
 * 4种整型，2种浮点类型，1种用于表示Unicode编码的字符单元的char和一种用于表示真值的boolean类型
 */
public class PrimitiveType {

	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午4:55:55
	 * @Description 
	 */
	public static void main(String[] args) {
		
		// 整型的范围
		Intrager();
		
		/*float的有效位数是6 ~ 7 位
		double的有效位数是15位
		大部分情况使用double即可*/

		// char
		charTest();
		
		// 变量必须显示初始化
		variableTest(2);
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午4:59:44
	 * @Description 计算四种整型的范围：<br>
	 * int:4字节，刚好超过20亿<br>
	 * long:8字节<br>
	 * short:2字节<br>
	 * byte:1字节：Bit意为"位"或"比特",是计算机运算的基础； 
	 * Byte意为"字节",是计算机文件大小的基本计算单位； 
	 * 1byte=8bits,两者换算是1：8的关系.
	 * 两个字节一个汉字.
	 * 所以16bit＝1个汉字
	 */
	public static void Intrager(){
		// 计算byte的大小，其中byte是8位，1个字节
		int numByte = 2;
		for(int i = 0; i < 7; i++){
			numByte = numByte * 2;
		}
		System.out.println("byte：" + (numByte / 2 * -1) + " ~ " + (numByte / 2 - 1));
		
		// 计算shot的大小，其中shote是2个字节，16位
		int numShort = 2;
		for(int i = 0; i < 15; i++){
			numShort = numShort * 2;
		}
		System.out.println("short：" + (numShort / 2 * -1) + " ~ " + (numShort / 2 - 1));
		
		// 计算int的大小，其中int是4字节，32位
		long numInt = 2L;
		for(int i = 0; i < 31; i++){
			numInt = numInt * 2L;
		}
		System.out.println("int：" + (numInt / 2 * -1) + " ~ " + (numInt / 2 - 1));
		
		// 计算long的大小，其中long是8字节，64位
		long numLong = 2;
		for(int i = 0; i < 61; i++){		// 由于2的63次方已经大于long的最大值，所以先求62次方，输出的时候再乘一次
			numLong = numLong * 2;
		}
		System.out.println("long：" + (numLong * 2 * -1) + " ~ " + (numLong * 2 - 1));
		
	}
	
	
	// char 简单测试
	public static void charTest(){
		char char1 = 'A';
		System.out.println(char1);
	}

	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午5:37:06
	 * @Description 变量声明测试<br>
	 * 变量必须显示初始化，例如下面的代码，如果没有else，则无法编译通过
	 */
	public static void variableTest(int type){
		String str;
		if(type == 1){
			str = "init";
		}else{
			str = "init2";
		}
		System.out.println(str);
	}
}
