package day03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * 字符串支持正则表达式二:
 *  String[] split(String regex)
 *   将当前字符串按照满足正则表达式要求的部分进行拆分，并将拆分出的内容返回。
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        //按照数字部分将字符串拆分
//        String regex = "[0-9]+";
//        String[] data = str.split(regex);
//        System.out.println(data.length);
//        System.out.println(Arrays.toString(data));
        /*
         拆分时，若两侧没有内容时，会拆分出空字符串。
         如果是在字符串末尾连续拆分出空字符串，那么都会被忽略。

         若按以下方式拆分:
         abc123def456ghi
         与
         abc123def456ghiasdjhsjdfhajsdfhjsdafh
         拆分出的数组长度是一样的
         */
        String regex = "[a-z]";
        String[] data = str.split(regex);
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        String imageName = "123.jpg";
        String[] arr = imageName.split("\\.");
        System.out.println(Arrays.toString(arr));

        imageName = System.currentTimeMillis()+"."+arr[arr.length-1];
        System.out.println(imageName);

    }
}
