package day04;

import java.io.File;

/**
 * 创建一个空目录
 */
public class MkdirDemo {
    public static void main(String[] args) {
        /*
        在当前目录下新建一个名为：demo目录
        相对路径中"./"可以不写，默认就是在当前目录下开始
         */
        File dir = new File("demo");
        if (dir.exists()){
            System.out.println("目录已存在");
        }else{
            dir.mkdir();
            System.out.println("目录已创建");
        }


    }
}
