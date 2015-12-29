/**
 * @Title ArrayListTest.java
 * @Package com.corejava9.chapter.one
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月8日 下午10:21:36
 * @copyright USTCINFO
 */
package java.corejava9.chapter.one;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author YanLiang
 *
 */
public class ArrayListTest {

    /**
     * @author yan.liang
     * @date 2015年7月8日 下午10:21:36
     * @Description TODO(这里用一句话描述这个方法的作用)
     */
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("acc");
        strings.add("bdc");
        strings.add("dsc");
        strings.add("zsc");
        strings.add("csc");

        System.out.println("排序前");
        for (String string : strings) {
            System.out.println(string);
        }

        Collections.sort(strings);
        System.out.println("排序后");
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
