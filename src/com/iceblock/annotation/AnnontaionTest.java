/**
 * @Title AnnontaionTest.java
 * @Package com.corejava9.chapter.annotation
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年8月19日 下午2:59:56
 * @copyright USTCINFO
 */
package com.iceblock.annotation;

/**
 * @author YanLiang
 *
 */
public class AnnontaionTest {

    /**
     * @author yan.liang
     * @date 2015年8月19日 下午2:59:57
     * @Description TODO(这里用一句话描述这个方法的作用)
     */
    @classLinstiner
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}


@interface classLinstiner {
    String value() default "test";
}