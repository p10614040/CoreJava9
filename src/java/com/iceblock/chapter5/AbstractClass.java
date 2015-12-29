/**
 * @Title AbstractClass.java
 * @Package com.corejava9.chapter5
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月15日 下午2:52:06
 * @copyright USTCINFO
 */
package com.iceblock.chapter5;

/**
 * @author YanLiang
 * 抽象类，其中即可以定义抽象方法也可以定义非抽象方法<br>
 * 如果一个非抽象类继承了抽象类，则必须实现超类的抽象丰富<br>
 * 抽象类不能实例化<br>
 */
public abstract class AbstractClass {

    private int a;
    private static int b;
    private static final int c = 0;
    public int d;
    public static int e;

    /**
     * @param a
     * @param d
     */
    public AbstractClass(int a, int d) {
        super();
        this.a = a;
        this.d = d;
    }

    public void seta() {

    }

    public abstract void setb();
}

class childClass extends AbstractClass {

    /**
     * @param a
     * @param d
     */
    public childClass(int a, int d) {
        super(a, d);
    }

    /*
     * Description:
     */
    @Override
    public void setb() {
        // TODO Auto-generated method stub

    }


}