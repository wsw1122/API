package day08;

/**
 * 异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //使用RunTimeException抛出异常
        p.setAge(1000);
        System.out.println(p.getAge());
    }
}
