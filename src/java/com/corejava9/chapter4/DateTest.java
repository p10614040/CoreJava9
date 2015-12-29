/**
 * @Title Date.java
 * @Package com.corejava9.chapter4
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月2日 下午4:29:11
 * @copyright USTCINFO
 */
package java.corejava9.chapter4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author YanLiang
 *
 */
public class DateTest {

    /**
     * @author yan.liang
     * @date 2015年7月2日 下午4:29:11
     * @Description Date对象储存的是特定的瞬间，精确到毫秒
     */
    public static void main(String[] args) {

		/*
         * 1、创建对象
		 */
        Date aDate = new Date();
        // 下面两个结果相同
        System.out.println(aDate);
        System.out.println(aDate.toString());
		
		
		/*
		 * 2、与日期的转换
		 * 大部分日期相关的方法、构造函数都已过时
		 * 建议使用Calendar类进行处理
		 */
        System.out.println(aDate.getMonth());
		
		/*
		 * 3、GregorianCalendar
		 */
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        aDate = gregorianCalendar.getTime();
        System.out.println(aDate);

        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.getFirstDayOfWeek());

    }

}
