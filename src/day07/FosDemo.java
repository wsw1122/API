package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 流  java标准的IO操作：使用流我们可以以同一的方式读写一切设备。
 *
 * java将流按照读写功能分为:
 * 输入流:用于从外界(硬盘/网络)读取数据到程序(内存)中      	(负责读操作)
 * 输出流:用于将数据从程序中写出到外界  					(负责写操作)
 *
 * java.io.InputStream是所有字节输入流的超类
 * java.io.OutputStream是所有字节输出流的超类
 * 它们规定了所有流都必须具备的读或写操作。因此无论读写什么设备的流，读写方法都是一样的。
 *
 * java将流分为节点流和处理流两大类:
 * 节点流:又称为低级流，是实际连接程序与另一端的"管道",
 * 负责实际读或写数据的流。读写操作一定是建立在节点流的基础上进行的。
 *
 * 处理流:又称为高级流，不能独立存在，必须连接在其他流上
 * 目的是当数据流经当前处理流时可以对数据进行某种加工处理操作，简化我们对数据的相关操作。
 *
 * 文件流:
 * 文件流是一对低级流，用于读写文件。
 *
 * 文件流与RandomAccessFile都是用来读写文件数据的，虽然读写方法定义都相同(read,write方法)
 * 但是底层实际的读写形式完全不同。
 *
 * 文件流是基于java标准IO对文件进行数据读写的，而流的读写形式为【顺序读写】,
 * 即:读或写操作只能顺序向后，不可回退。
 *
 * RAF是基于指针的随机读写形式，可以操作指针对文件任意位置进行读写。
 * 所以文件流做不到对文件任意位置编辑操作，但是基于流连接可以轻松完成RAF不容易办到的事情。
 *
 * 流连接:使用流读写时，串联若干的高级流，并最终串联到某个低级流对某设备进行读写操作的过程。
 *
 * 流连接也是IO的精髓。
 */
public class FosDemo {
    public static void main(String[] args) throws IOException {
        /*
        FileOutputStream提供构造方法:
         FileOutputStream(File file)
         FileOutputStream(String path)
        1.以上形式创建文件输出流时，若指定的文件已经存在
        那么流创建时会先将该文件数据全部清除，所以这种方式为覆盖写模式。
         */
//        FileOutputStream fos = new FileOutputStream("fos.txt");

        /*
        2.如果创建时在传入一个boolean类型值的参数，那么当前文件出输出流就会变为追加模式。
        即:文件已存在则数据保留。通过流写出的内容会被追加到文件末尾。
         */
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        String str = "不是吧,不是吧,难道单压也算压";
        byte[] data = str.getBytes("utf-8");
        fos.write(data);

        fos.write("无视他,无视他,蓝调专家也算家".getBytes("utf-8"));

        System.out.println("写出完毕");
        fos.close();
    }
}




