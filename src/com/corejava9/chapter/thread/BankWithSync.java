/**
 * 
 * @Title BankNoLock.java
 * @Package com.corejava9.chapter.thread
 * @Description 没有同步的银行类
 * @author yan.liang
 * @date 2015年7月23日 下午5:08:00
 * @copyright USTCINFO
 */
package com.corejava9.chapter.thread;

/**
 * @author YanLiang
 *
 */
public class BankWithSync{

	// 总存款
	private final long[] accounts;

	/**
	 * 初始化赋值
	 */
	public BankWithSync(int n, long initBalance) {
		accounts = new long[n];
		for (int i = 0 ; i < n ; i++) {
			accounts[i] = initBalance;
		}
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年7月23日 下午5:12:34
	 * @Description 账户之间转移存款
	 */
	public synchronized void transfr(int from, int to, long balance){
		if(accounts[from] >= balance){		// 有钱才能转移
			System.out.println(Thread.currentThread());
			accounts[from] -= balance;
			accounts[to] += balance;
			System.out.printf("%d from %d to %d\n", balance, from, to);
			System.out.printf("Total amount : %d\n" , getTotalAmount());
		}
	}
	
	
	/**
	 * @author yan.liang
	 * @date 2015年7月23日 下午5:18:23
	 * @Description 统计总存款
	 */
	public synchronized long getTotalAmount(){
		long amount = 0;
		for (long account : accounts) {
			amount += account;
		}
		return amount;
	}

	
	public int size(){
		return accounts.length;
	}
}
