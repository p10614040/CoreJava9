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
public class BankWithSyncTest {

	public static void main(String[] args){
		// synchronized测试：偶尔有阻塞的情况，但是总存款不会有变化
		Runnable bankRunnable = new BankWithSyncRunnable(new BankWithSync(20, 10000L), 5000L);
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
