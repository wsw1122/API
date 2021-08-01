package day04;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //删除当前目录下的show.txt文件
        File file = new File("./show.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else{
            System.out.println("文件不存在");
        }

    }
}
