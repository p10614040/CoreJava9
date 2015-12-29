/**
 * @Title People.java
 * @Package com.corejava9.chapter5
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月9日 下午5:18:50
 * @copyright USTCINFO
 */
package java.corejava9.chapter5;

/**
 * @author YanLiang
 *
 */
public class People {

    private String name;
    private int age;

    /**
     * @param name
     * @param age
     */
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * Description:
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /*
     * Description:
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        People other = (People) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    /*
     * Description:
     */
    @Override
    public String toString() {
        return getClass().getName() + "[name = " + name + ", age = " + age + "]";
    }

}
