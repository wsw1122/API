package day04;

import java.io.File;

/**
 * 编写程序，删除给定的文件或目录
 */
public class DeleteDirTest {
    public static void main(String[] args) {
        File dir = new File("./a");
        delete(dir);
    }

    public static void delete(File file) {
        if(file.isDirectory()){
            //先将目录清空
            //1.获取目录中所有子项
            File[] subs = file.listFiles();
            //2.逐个删除子项

            for(int i=0;i<subs.length;i++){
                /*
                   一个方法内部调用自己方法的现象称为：递归
                  递归在实际开发中能避免使用尽量避免(资源开销大，运行速度慢)
                  若使用递归，应当注意满足一下两点:
                   1.递归调用必须被一个分支语句控制，不然方法内部必然执行递归则是死循环
                   2.递归层数尽量少(开销大)
                 */
                delete(subs[i]);
            }
        }
        file.delete();
    }

    public void a(){
        System.out.println("aaa");
        b();
        System.out.println("111");
    }
    public void b(){
        System.out.println("bbb");
        c();
        System.out.println("ddd");
    }
    public void c(){
        System.out.println("ccc");
    }


}
