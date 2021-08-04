package day04;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileFilter;

/**
 * listFiles的重载方法允许我们传入一个文件过滤器:
 *  File[] listFiles(FileFilter filter)
 *   该方法会讲当前File对象表示的目录中满足过滤器要求的子项获取回来.
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            //获取以"."开头的文件(目录)
//            FileFilter filter = new FileFilter() {
//                public boolean accept(File file) {
//                    String name = file.getName();
//                    System.out.println("正在过滤:"+name);
//                    return name.startsWith(".");
//                }
//            };
            //练习：获取所有文件的过滤器
            FileFilter filter = new FileFilter(){
                public boolean accept(File file) {
                    return file.isFile();
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("获取子项完毕");
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
