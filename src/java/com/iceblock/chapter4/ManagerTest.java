/**
 * @Title ManagerTest.java
 * @Package com.corejava9.chapter5
 * @Description Java 继承
 * @author yan.liang
 * @date 2015年7月6日 下午8:41:54
 * @copyright USTCINFO
 */
package com.iceblock.chapter4;
// 静态调用

import static java.lang.System.out;

/**
 * @author YanLiang
 * 关键字：继承、super、覆盖、超类、子类、无参构造函数、多态
 */
public class ManagerTest {

    /**
     * @author yan.liang
     * @date 2015年7月6日 下午8:41:55
     * @Description 继承测试
     */
    public static void main(String[] args) {

        Manager manager = new Manager(7500, "yan.liang");
        manager.show();

		/*
		 * 子类可以赋值给超类，但是超类不能赋值给子类。
		 * 如果超类赋值给子类，子类中的独有方法、域都无法初始化。
		 */
        Employ employ;
        employ = manager;
        // manager = employ;

    }

}

/*
 * 定义经理类，继承员工类
 */
class Manager extends Employ {

    // 覆盖超类的域
    private int salary;

    /**
     * @param salary
     * @param name
     * 由于Employ类没有默认的空参数构造器，所以子类中必须显示的在构造器中实现其有参构造器<br>
     * 如果没有显示的调用超类构造器，则会默认调用 super() 空构造器
     */
    public Manager(int salary, String name) {
        super(salary, name);
    }


    /**
     * @author yan.liang
     * @date 2015年7月6日 下午8:47:13
     * @Description 继承方法的时候，静态方法必须是静态方法才能覆盖，否则编译报错<br>
     * 调用父页面方法可以使用super.，防止子类中有重名方法循环调用
     */
    public String getName() {
        String name = super.getName();
        return name;
    }

    public void show() {
        out.println(this.getName() + ":" + getSalary());
    }
}
