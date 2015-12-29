/**
 * @Title Block.java
 * @Package com.corejava9.chapter3
 * @Description 块
 * @author yan.liang
 * @date 2015年6月30日 下午9:40:57
 * @copyright USTCINFO
 */
package java.corejava9.chapter3;

/**
 * @author YanLiang
 *
 */
public class Block {

    static int i = 0;
    static int j;

    /*
     * 加上 static 方可执行
     */
    static {
        j = 1;
        System.out.println(j);
    }

    /**
     * @author yan.liang
     * @date 2015年6月30日 下午9:40:57
     * @Description Block 块测试<br>
     * 块是花括号括起来的一段代码<br>
     * 块决定了变量作用域<br>
     */
    public static void main(String[] args) {

        System.out.println(i);
        System.out.println(j);

        int m = 2;

        {
            int n = 3;
            System.out.println(n);
            System.out.println(m);
        }

        System.out.println(m);

    }

}
