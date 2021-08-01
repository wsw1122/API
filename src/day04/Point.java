package day04;

import java.util.Objects;

/**
 * 使用当前类测试Object相关方法的重写
 */
public class Point {
    //外界不可以直接访问(访问意味可以修改)
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 重写toString():
     *  通常我们自己定义的类的toString方法被调用，就应当重写该方法。
     *  重写没有固定要求，原则上返回的字符串中应当包含当前对象的属性信息。
     */
    public String toString() {
        return "("+x+","+y+")";
    }

    /**
     * 重写Object提供的equals方法
     *  判断当前对象与参数对象内容是否相同
     *
     * 判断内容实际上就是判断属性值，但没有要求所有属性的值都相同才认定为
     * 相同，可结合实际需求而定
     */
//    public boolean equals(Object obj){
//        if(obj==null)
//            return false;
//        if(this == obj)
//            return true;
//        if(obj instanceof Point){
//            Point p = (Point)obj;
//            //比较关键属性
//           return this.x==p.x && this.y==p.y;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
