/**
 * @Title Condition.java
 * @Package com.corejava9.chapter3
 * @Description 条件语句
 * @author yan.liang
 * @date 2015年6月30日 下午9:51:47
 * @copyright USTCINFO
 */
package java.corejava9.chapter3;

/**
 * @author YanLiang
 *
 */
public class Condition {

    /**
     * @author yan.liang
     * @date 2015年6月30日 下午9:51:47
     * @Description 条件语句
     */
    public static void main(String[] args) {
        /*
		 * else 与最近的if组合
		 * 输出4
		 */
        int i = 0;
        if (i == 1)
            if (i == 2)
                System.out.println("2");
            else
                System.out.println("3");
        System.out.println("4");

		/*
		 * do ... while ...
		 */
        do {
            System.out.println(++i);
        }
        while (i < 2);
		
		/*
		 * switch，7可以针对String进行判断，以下版本只能对基本类型进行校验
		 * 并且每个case后都应该有break！
		 */
        char caseString = 'J';
        switch (caseString) {
            case 'J':

                break;

            default:
                break;
        }
		
		
		/*
		 * 带标签的break
		 */
        bigif:
        if (i == 2) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break bigif;    // 直接跳出bigif
                }
            }
            System.out.println("if正常结束");
        }
        System.out.println("bigif结束");

        new String("123");
    }

}
