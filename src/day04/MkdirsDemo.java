package day04;

import java.io.File;

/**
 * 创建一个多级目录
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        File dir = new File("a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("目录已存在");
        }else{
            //创建当前目录是会将不存在的父目录一并创建
            dir.mkdirs();
            System.out.println("目录已创建");
        }

    }
}
