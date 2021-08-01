package day02;

/**
 * char charAt(int index)
 *  返回指定位置对应的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";

        char c = str.charAt(1);
        System.out.println(c);
        /*
         检测回文 (判断是否是回文)
         */
        String line = "上海自来水自海上";

/*
        for(int i=0;i<line.length()/2;i++){
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length()-1-i);
            if(c1!=c2){
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");
 */
/*
        boolean check = true;
        for(int i=0;i<line.length()/2;i++){
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length()-1-i);
            if(c1!=c2){
                System.out.println("不是回文");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("是回文");
        }
 */
        for(int i=0;i<line.length()/2;i++){
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length()-1-i);
            if (c1!=c2){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文");


    }
}
