/**
 * @Title StudentCloneTest.java
 * @Package com.corejava9.chapter6
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月15日 下午3:03:05
 * @copyright USTCINFO
 */
package java.corejava9.chapter6;


import java.util.ArrayList;
import java.util.List;

import java.corejava9.chapter5.Student;

/**
 * @author YanLiang
 *
 */
public class StudentCloneTest {

    /**
     * @author yan.liang
     * @throws CloneNotSupportedException
     * @date 2015年7月15日 下午3:03:05
     * @Description 对象继承Cloneable接口
     */
    public static void main(String[] args) throws CloneNotSupportedException, ClassCastException {

        StudentClone student1 = new StudentClone("ZhangSan", 20, 85);
        StudentClone student2;

        student2 = student1.clone();
        student2.score = 90;

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        Student student3 = student2;
        StudentClone studentClone4 = (StudentClone) student3;

        List<StudentClone> students = new ArrayList<StudentClone>();
        StudentClone[] students3 = students.toArray(new StudentClone[students.size()]);
        // StudentClone[] students2 = (StudentClone[])students.toArray(); // error


    }

}

class StudentClone extends Student implements Cloneable {

    /**
     * @param name
     * @param age
     * @param score
     */
    public StudentClone(String name, int age, int score) {
        super(name, age, score);
    }

    public StudentClone clone() throws CloneNotSupportedException {
        return (StudentClone) super.clone();
    }
}