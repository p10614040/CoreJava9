/**
 * @Title BankNoLockRunnable.java
 * @Package com.corejava9.chapter.thread
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月23日 下午5:21:10
 * @copyright USTCINFO
 */
package java.corejava9.chapter.thread;

/**
 * @author YanLiang
 *
 */
public class BankWithLockRunnable implements Runnable {

    private BankWithLock bank;
    private long MaxAmount;


    /**
     *
     */
    public BankWithLockRunnable(BankWithLock bank, long MaxAmount) {
        this.bank = bank;
        this.MaxAmount = MaxAmount;
    }


    /*
     * Description:
     */
    @Override
    public void run() {
        while (true) {
            int toAcount = (int) (bank.size() * Math.random());
            int fromAcount = (int) (bank.size() * Math.random());
            long transfrAmount = (long) (MaxAmount * Math.random());
            bank.transfr(fromAcount, toAcount, transfrAmount);
        }
    }

}
