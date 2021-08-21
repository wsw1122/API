package day13;

import day04.Point;

import java.util.Arrays;

/**
 *  比较复杂的集合保存和引用操作示例
 */

public class CollectionDemo4 {
    public static void main(String[] args) {
        String str="hello";
        Integer a=1;
        Point p=new Point(1,2);
        Point[] array={
                new Point(1,2),
                new Point(3,4),
                new Point(5,6)
        };
        test(str,a,p,array);
        System.out.println("str = " + str);
        System.out.println("a = " + a);
        System.out.println("p = " + p);
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void test(String str,Integer a,Point p,Point[] array){
        str=str.substring(1);  //str:ello
        a++;
        a=3;
        p.setX(2);// p: 2,2
        p=new Point(7,8);// p:7,8
        array[0].setX(10);
        Point[] array2=Arrays.copyOf(array,array.length+1);
        array2[0].setX(5);
        array2[array2.length-1]=p;
        array=array2;
        array[array2.length-1].setX(20);
        System.out.println("------------------------------------");
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("------------------------------------");

    }




}
