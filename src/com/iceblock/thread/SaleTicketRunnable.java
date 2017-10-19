/**
 * @Title SaleTicketRunnable.java
 * @Package com.corejava9.chapter.thread
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月22日 下午3:54:21
 * @copyright USTCINFO
 */
package com.iceblock.thread;

/**
 * @author YanLiang
 *
 */
public class SaleTicketRunnable implements Runnable {

    private int tickets = 20;

    /*
     * Description:
     */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.tickets > 0) {
                System.out.println(" tickets : " + tickets--);
            }
        }
    }

}
