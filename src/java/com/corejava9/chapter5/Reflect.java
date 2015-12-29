/**
 * @Title Reflect.java
 * @Package com.corejava9.chapter5
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月9日 下午9:15:16
 * @copyright USTCINFO
 */
package java.corejava9.chapter5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author YanLiang
 *
 */
public class Reflect {

    /**
     * @author yan.liang
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws NoSuchFieldException
     * @date 2015年7月9日 下午9:15:16
     * @Description 测试反射
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        Student student = new Student("LiSi", 19, 99);

        // Class 是个类型
        @SuppressWarnings("unchecked")
        Class<Student> studentClass = (Class<Student>) student.getClass();
        Class<Student> studentClass2 = Student.class;

        System.out.println(studentClass == studentClass2);        // true
        System.out.println(studentClass.equals(studentClass2));        // true

        // Class.newInstance() 只能调用无参构造器，所以这里会异常
        // Class.forName(Student.class.getName()).newInstance();


        // 分析类
        System.out.println(studentClass.getName());
        System.out
                .println(Arrays.toString(studentClass.getDeclaredFields()));
        ;

        @SuppressWarnings("rawtypes")
        Class student3 = Class.forName("com.corejava9.chapter5.Student");
        System.out.println(studentClass == student3);

        System.out.println(Arrays.toString(studentClass.getFields()));
        System.out.println(Arrays.toString(studentClass.getDeclaredAnnotations()));
        System.out.println(Arrays.toString(studentClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(studentClass.getDeclaredMethods()));


        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName());
            System.out.println("字段修饰符：" + Modifier.toString(field.getModifiers()));
        }

        System.out.println("读取对象中某个字段的值");
        Field fieldClass = Student.class.getDeclaredField("class1");
        System.out.println(fieldClass.get(student));

        Field scoreClass = Student.class.getDeclaredField("score");
        scoreClass.setAccessible(true);        // 设置之后可以访问私有成员
        System.out.println(scoreClass.get(student));

        System.out.println("修改私有对象");
        System.out.println(student.toString());    // score = 99
        scoreClass.set(student, 200);
        System.out.println(student.toString());    // score = 200
    }

}
