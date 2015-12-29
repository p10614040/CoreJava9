/**
 * @Title Student.java
 * @Package com.corejava9.chapter5
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月9日 下午5:21:52
 * @copyright USTCINFO
 */
package java.corejava9.chapter5;

/**
 * @author YanLiang
 *
 */
public class Student extends People {

    public int score;
    public String class1;

    /**
     * @param name
     * @param age
     * @param score
     * 超类没有无参构造函数，子类的必须使用构造函数调用super实现
     */
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
        this.class1 = "test";
    }

    /*
     * Description:
     */
    @Override
    public String toString() {
        return super.toString() + "[score = " + this.score + "]";
    }

}
