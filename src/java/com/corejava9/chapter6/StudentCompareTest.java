/**
 * @Title StudentCompareTest.java
 * @Package com.corejava9.chapter6
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月15日 下午2:25:12
 * @copyright USTCINFO
 */
package java.corejava9.chapter6;

import java.util.Arrays;
import java.util.Comparator;

import java.corejava9.chapter5.Student;

/**
 * @author YanLiang
 * 数组排序有两种方式，一种是要排序的类本身实现Comprareable接口，实现compareTo方法
 * 还一种是实现一个继承Comparetor的排序类，实现compare方法
 */
public class StudentCompareTest {

    /**
     * @author yan.liang
     * @date 2015年7月15日 下午2:25:12
     * @Description 根据分数排序
     */
    public static void main(String[] args) {

        StudentCompre student1 = new StudentCompre("ZhangSan", 20, 85);
        StudentCompre student2 = new StudentCompre("LiSI", 22, 75);
        StudentCompre student3 = new StudentCompre("WangWu", 19, 95);
        StudentCompre student4 = new StudentCompre("Liuliu", 21, 70);

        StudentCompre[] students = {student1, student2, student3, student4};
        for (StudentCompre studentCompre : students) {
            System.out.println(studentCompre.toString());
        }
        System.out.println("升序排列....");
        Arrays.sort(students);
        for (StudentCompre studentCompre : students) {
            System.out.println(studentCompre.toString());
        }

        System.out.println("降序排列....");
        Arrays.sort(students, new CompareStudent());
        for (StudentCompre studentCompre : students) {
            System.out.println(studentCompre.toString());
        }

    }

}


/**
 * @author YanLiang
 * 升序排列
 */
class StudentCompre extends Student implements Comparable<StudentCompre> {

    /**
     * @param name
     * @param age
     * @param score
     */
    public StudentCompre(String name, int age, int score) {
        super(name, age, score);
    }

    /*
     * Description:
     */
    @Override
    public int compareTo(StudentCompre o) {
        return super.score - o.score;
    }

}

/**
 * @author YanLiang
 * 降序排列
 */
class CompareStudent implements Comparator<Student> {

    /*
     * Description:
     */
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.score - o2.score) * -1;
    }

}
