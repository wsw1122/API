package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 *  java.io.ObjectOutputStream
 *  java.io.ObjectInputStream
 * 是一对高级流，负责将java对象与字节之间在读写的过程中进行转换
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {

        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"摄像","教学","演员"};
        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /*
        writeObject方法ObjectOutputStream提供的方法:
         作用：将给定的对象按照其结构转换为一组字节，然后再将字节通过其他流连接写出。
          (注：实际转换的字节比该对象保存的内容要大，主要包含该对象的结构信息等.)
         */
        /*
        下面写对象时每个刘负责的工作为：
         1.对象流首先将对象按照其结构转换为一组字节(对象序列化)
         2.序列化后的字节在经过文件流写入文件(对象持久化)
          持久化:写入文件-->写入了磁盘做长久保存(关机不会丢失)
        */
        oos.writeObject(p);
        System.out.println("写出完毕.");
        oos.close();

    }
}
















