/**
 * 
 * @Title BankSynsTest.java
 * @Package com.corejava9.chapter.thread
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月23日 下午5:19:29
 * @copyright USTCINFO
 */
package com.corejava9.chapter.thread;

/**
 * @author YanLiang
 *
 */
public class BankSynsTest {

	public static void main(String[] args){
		// 无锁现场测试：运行了一段时间之后总存款会有变化
		Runnable bankRunnable = new BankNoLockRunnable(new BankNoLock(20, 10000L), 5000L);
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
		new Thread(bankRunnable).start();
	}
}
