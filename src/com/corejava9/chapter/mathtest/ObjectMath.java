/**
 * 
 * @Title ObjectMath.java
 * @Package com.corejava9.chapter.mathtest
 * @Description 基本类型加减乘除
 * @author yan.liang
 * @date 2015年8月18日 下午9:10:04
 * @copyright USTCINFO
 */
package com.corejava9.chapter.mathtest;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author YanLiang
 *
 */
public class ObjectMath {

	/**
	 * 不需要实例化
	 */
	private ObjectMath() {
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月18日 下午9:27:33
	 * @Description 任意类型的数值计算
	 * @param valueA 入参A的值
	 * @param valueB 入参B的值
	 * @param mathTypeStr 计算规则，加减乘除等
	 * @param resultType 返回值类型
	 * 
	 * @return 计算结果
	 * @throws ScriptException
	 */
	public static Object calculateObject(Object valueA, Object valueB,
			String mathTypeStr, String resultType) throws ScriptException {
		/* 拼接计算字符串 */
		String scriptStr = valueA.toString() + " " + mathTypeStr + " "
				+ valueB.toString();

		/* 使用JS脚本引擎执行 */
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine sEngine = sem.getEngineByName("javascript");
		Double scriptStrResult = (Double) sEngine.eval(scriptStr);
		
		/* 判断返回值的类型 */
		if ("int".equals(resultType)
				&& Integer.MIN_VALUE < Math.round(scriptStrResult)
				&& Math.round(scriptStrResult) < Integer.MAX_VALUE) {
			return (int)Math.round(scriptStrResult);
		} else if ("long".equals(resultType)) {
			return Math.round(scriptStrResult);
		}
		return scriptStrResult;
	}

	/**
	 * @author yan.liang
	 * @throws ScriptException
	 * @date 2015年8月18日 下午9:10:04
	 * @Description 基本类型加减乘除
	 */
	public static void main(String[] args) throws ScriptException {

		/* 入参 */
		Object a = "1";
		Object b = 4;
		String resultType1 = "int";
		Object c = "4096";
		String mathType = "*";
		String resultType2 = "long";
		

		/* 计算( 1 * 4 * 4096 )*/
		System.out.println(ObjectMath.calculateObject(
				ObjectMath.calculateObject(a, b, mathType, resultType1), c,
				mathType, resultType2));

	}

}
