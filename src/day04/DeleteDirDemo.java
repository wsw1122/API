package day04;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("demo");
        if(dir.exists()){
            //删除目录的前提是：这个目录是一个空目录
            dir.delete();
            System.out.println("目录已删除");
        }else {
            System.out.println("目录不存在");
        }
    }
}
