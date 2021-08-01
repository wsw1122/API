package day04;

import java.io.File;

/**
 * java.io.File
 *  File每一个实例用于表示文件系统中的一个文件或目录(文件夹)的
 *
 * 使用File可以:(不可以:访问文件数据)
 *  1.访问其表示的文件或目录的属性信息
 *  2.创建或删除文件或目录
 *  3.访问一个目录中的所有子项
 */
public class FileDemo1 {
    public static void main(String[] args) {

        //绝对路径
//        File file = new File("D:/day04/pm/demo.txt");

        //相对路径
        File file = new File("./demo.txt");
        /*
        这里指定路径时，应当指定相对路径，因为绝对路径的“根目录”，
        不同的操作系统是不相同的，不利于跨平台。

        相对路径的好处是屏蔽了系统差异，但是具体相对那里要根据运行程序时的坏境而定。
        "./" 指代 当前目录。
        在idea/eclipse中, "./"当前程序所在项目的项目目录
         */
        //获取名字
        String name = file.getName();
        System.out.println("name:"+name);
        //获取文件长度(字节量)
        long length = file.length();
        System.out.println("length:"+length);

        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println("可读:"+cr);
        System.out.println("可写:"+cw);

        boolean ih = file.isHidden();
        System.out.println("隐藏文件:"+ih);


    }
}
