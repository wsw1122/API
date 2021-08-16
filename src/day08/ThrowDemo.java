package day08;

/**
 * 异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //使用RunTimeException抛出异常
        try {
            p.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }
}
