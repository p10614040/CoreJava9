/**
 * @Title BigNumber.java
 * @Package com.corejava9.chapter3
 * @Description 大数值
 * @author yan.liang
 * @date 2015年7月1日 下午4:05:42
 * @copyright USTCINFO
 */
package com.iceblock.chapter3;

import java.math.BigInteger;

/**
 * @author YanLiang
 *
 */
public class BigNumber {

    /**
     * @author yan.liang
     * @date 2015年7月1日 下午4:05:42
     * @Description BigInteger BigDecimal
     */
    public static void main(String[] args) {

        // 使用静态方法 valueOf 将普通数值转换为大数值
        BigInteger bigInteger = BigInteger.valueOf(100);
        System.out.println(bigInteger);

        // 大数值相加必须使用 add 方法
        BigInteger bigInteger2 = BigInteger.valueOf(200);
        System.out.println(bigInteger.add(bigInteger2));

        // 大整形的1
        System.out.println(BigInteger.ONE);

        // 大整形比较 compareTo ：0表示相等，-1表示小于，1表示大于
        System.out.println(bigInteger.compareTo(bigInteger2));
        System.out.println(bigInteger2.compareTo(bigInteger2));
    }

}
