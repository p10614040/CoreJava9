/**
 * @Title BankNoLock.java
 * @Package com.corejava9.chapter.thread
 * @Description 有锁的银行类
 * @author yan.liang
 * @date 2015年7月23日 下午5:08:00
 * @copyright USTCINFO
 */
package com.iceblock.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author YanLiang
 *
 */
public class BankWithLock {

    // 总存款
    private final long[] accounts;
    private Lock bankLock;

    /**
     * 初始化赋值
     */
    public BankWithLock(int n, long initBalance) {
        accounts = new long[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = initBalance;
        }
        bankLock = new ReentrantLock();
    }

    /**
     * @author yan.liang
     * @date 2015年7月23日 下午5:12:34
     * @Description 账户之间转移存款
     */
    public void transfr(int from, int to, long balance) {
        bankLock.lock();
        try {
            if (accounts[from] >= balance) {        // 有钱才能转移
                System.out.println(Thread.currentThread());
                accounts[from] -= balance;
                accounts[to] += balance;
                System.out.printf("%d from %d to %d\n", balance, from, to);
                System.out.printf("Total amount : %d\n", getTotalAmount());
            }
        } finally {
            bankLock.unlock();
        }
    }


    /**
     * @author yan.liang
     * @date 2015年7月23日 下午5:18:23
     * @Description 统计总存款
     */
    public long getTotalAmount() {
        bankLock.lock();
        try {
            long amount = 0;
            for (long account : accounts) {
                amount += account;
            }
            return amount;
        } finally {
            bankLock.unlock();
        }
    }


    public int size() {
        return accounts.length;
    }
}
