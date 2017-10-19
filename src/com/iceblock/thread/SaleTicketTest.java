/**
 * @Title SaleTicketTest.java
 * @Package com.corejava9.chapter.thread
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月22日 下午3:55:05
 * @copyright USTCINFO
 */
package com.iceblock.thread;

/**
 * @author YanLiang
 *
 */
public class SaleTicketTest {

    /**
     * @author yan.liang
     * @throws InterruptedException
     * @date 2015年7月22日 下午3:55:05
     * @Description TODO(这里用一句话描述这个方法的作用)
     */
    public static void main(String[] args) throws InterruptedException {

        // ① 使用run方法测试
        SaleTicketThread saleTicketThread1 = new SaleTicketThread();
        SaleTicketThread saleTicketThread2 = new SaleTicketThread();
        /*saleTicketThread1.run();
		saleTicketThread2.run();
		System.out.println("测试①结束...");*/
        // ① 结论：并没有启动新的线程，而是轮流执行


        // ② 使用start方法
		/*saleTicketThread1.start();
		saleTicketThread2.start();
		System.out.println("测试②结束...");*/
        // ② 结论：使用start方法会开启新的线程


        // ③ 同一个现场 start 两次是否启动两个线程
		/*saleTicketThread1.start();
		saleTicketThread1.start();
		System.out.println("测试③结束...");*/
        // ③ 结论：同一个线程不能 start 两次

        // ④ 使用 runnable 接口启动现场
        SaleTicketRunnable saleTicketRunnable1 = new SaleTicketRunnable();
        SaleTicketRunnable saleTicketRunnable2 = new SaleTicketRunnable();
		/*new Thread(saleTicketRunnable1).start();
		new Thread(saleTicketRunnable2).start();
		System.out.println("测试④结束...");*/

        // ⑤ 使用 runnable 接口启动两次start
		/*new Thread(saleTicketRunnable1).start();
		new Thread(saleTicketRunnable1).start();*/
        // ⑤ 结论：runnable接口的线程可以共享资源，两个线程一起“买票”


        // ⑥ 测试线程状态
        System.out.println(saleTicketThread1.getState());    // NEW
        saleTicketThread1.start();
        System.out.println(saleTicketThread1.getState());    // RUNNABLE
        Thread.sleep(2000);
        System.out.println(saleTicketThread1.getState());    // TERMINATED

    }

}
