package day08;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    /**
     * 通常一个方法使用throws抛出异常
     * 就要在方法声明时使用throws声明这个异常的抛出。只有RuntimeException是个例外。
     */
    public void setAge(int age) throws IllegalAgeException{
        if (age<0||age>100){
            //使用throw关键字可以对外抛出一个异常
//            throw new RuntimeException("年龄不合法");
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
