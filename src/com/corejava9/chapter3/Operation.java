/**
 * 
 * @Title Operation.java
 * @Package com.corejava9.chapter3
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年6月27日 下午8:26:56
 * @copyright USTCINFO
 */
package com.corejava9.chapter3;

/**
 * @author YanLiang
 *
 */
/**
 * @author YanLiang
 *
 */
public class Operation {

	/**
	 * @author yan.liang
	 * @date 2015年6月27日 下午8:26:56
	 * @Description 运算符测试<br>
	 * 浮点运算在不同的处理器上运算结果可能不同
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		int x = 1;
		int y = 2;
		
		/*下面两张写法，
		 * 第一种是二元运算符，表示 x = x +2，
		 * 第二种表示 y = +3，是赋值。*/
		x += 2;
		y =+ 3;
		
		System.out.println("x = " + x + "，y = " + y);
		
		// 输出0
		System.out.println(1 / 10);
		// 输出0.1
		System.out.println(1f / 10f);
		
		
		int a = 4;
		a++;
		System.out.println(a);
		/*
		 * 4++;
		 * ++运算符改变的是变量的值，所以这种写法非法
		 * */
		
		// 求平方根
		double b1 = 4;
		double b2 = Math.sqrt(b1);
		System.out.println(b2);
		

		double b3 = 6;
		System.out.println(Math.sqrt(b3));	// double 最长15位
		System.out.println(StrictMath.sqrt(b3));	// double 最长15位

		// 计算 int 最大值
		System.out.println((Math.pow(2, 31) - 1));
		
		// π的大小
		System.out.println(Math.PI);
		
		/*
		 * 类型转换：
		 * 合法转换：
		 * 低位类型	=>	高位类型
		 * char		=>	高位类型
		 * short,byte	!=>		char
		 * int,long 	~>		float	有可能有精度丢失
		 */
		byte byte1 = 1;
		short short1 = byte1;
		System.out.println(short1);
		
		short short2 = 22;
		int int2 = short2;
		System.out.println(int2);
		
		char char3 = 'a';
		int int3 = char3;
		long l3 = char3;
		float f3 = char3;
		double d3 = char3;
		System.out.println(int3);
		
		float f1 = byte1;
		
		
		/*
		 * 使用强制类型转换时，会自动截断
		 * 如果超出了目标类型的范围，会出现意料之外的值
		 */
		
		
		/*
		 * 运算优先级
		 * 中括号、点、小括号优先级最高
		 * 一元元素符、强制类型转换、new优先级次之
		 * 乘除、加减
		 */
		
		
		StringTest();
		
	}
	
	
	/*
	 * Java字符串
	 * 字符串是由char序列组成
	 * 1.字符串是不可变的，可变的是字符串对应的引用
	 * 2.每个字符串创建相当于创建了一个String的实例
	 * 3.编译器会让这些不可变字符串共享
	 */
	public static final void StringTest(){
		// 输出Java™
		String javaTM = "Java\u2122";
		System.out.println(javaTM);
		
		
		// 字符串比较
		String testTwo1 = "Java™";
		String testTwo2 = "Java™";
		String testTwo3 = "JaVa™";
		System.out.println(testTwo1.equals(testTwo2));
		System.out.println(testTwo1 == testTwo2);						// 由于字符串常量共享，这里也是相等的
		System.out.println(testTwo1.equalsIgnoreCase(testTwo3));		// 忽略大小写
		System.out.println(testTwo1.compareTo(testTwo2) == 0);
		
		// 返回位置2的unicode代码单位
		System.out.println(testTwo3.charAt(4));
		System.out.println(testTwo3.codePointAt(4));
		
		// 遍历字符串
		for(int i = 0; i <= testTwo1.length() - 1; i++){
			System.out.println(testTwo3.charAt(i));
		}
		
		
		// 替换
		testTwo3 = testTwo3.replace("a", "A");
		System.out.println(testTwo3);
		System.out.println(testTwo3.toLowerCase());
		
		
		// stringbuilder 与 stringbuffer相比
		// 线程不安全；但是效率更高
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("1");
		stringBuilder.append("2");
		System.out.println(stringBuilder.toString());
	}
	
	

}
