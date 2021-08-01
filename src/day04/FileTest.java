package day04;

import java.io.File;

/**
 * 获取一个目录中所有子项
 */
public class FileTest {
    public static void main(String[] args) {
        //获取当前目录下所有子项
        File dir = new File(".");
        /*
        boolean isFile()        判断当前File表示的是否是文件
        boolean isDirectory()   判断当前File表示的是否是目录
         */
        if(dir.isDirectory()){
            /*
            File[] listFiles()
             获取该目录下所有子项，每一个子项都是一个File实例
             */
            File[] subs = dir.listFiles();
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
