package java.corejava9.chapter.classLoader;

import java.corejava9.chapter5.Student;

/**
 * @Title Test.java
 * @Package
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月20日 下午2:47:21
 * @copyright USTCINFO
 */

/**
 * @author YanLiang
 *
 */
public class Test {

    /**
     * @author yan.liang
     * @date 2015年7月20日 下午2:47:22
     * @Description TODO(这里用一句话描述这个方法的作用)
     */
    public static void main(String[] args) {
        // java 位于 rt.jar 中的核心类都是有Bootstrap 类装载器装置
        System.out.println(System.class.getClassLoader());
        ;        // 返回 null
        // sun.misc.Launcher$AppClassLoader
        System.out.println(Student.class.getClassLoader().getClass().getName());
        // AppClassLoader 父级装载器是 ExtClassLoader
        System.out.println(Student.class.getClassLoader().getParent().getClass().getName());
        // sun.misc.Launcher$ExtClassLoader
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class
                .getClassLoader().getClass().getName());
        // ExtClassLoader 父装载器是 Bootstrap : null
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class
                .getClassLoader().getParent());
    }

}
