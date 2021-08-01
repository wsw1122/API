package day04;
import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        // 在当前目录新新建一个名为show.txt文件
        File file = new File("./show.txt");
        //判断File表示的文件(目录)是否存在
        if(file.exists()){
            System.out.println("文件已存在");
        }else{
            //创建该文件
            file.createNewFile();
            System.out.println("文件已创建");
        }

    }
}
