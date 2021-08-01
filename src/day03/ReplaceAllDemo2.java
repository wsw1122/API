package day03;

/**
 * 和谐用语
 */
public class ReplaceAllDemo2 {
    public static void main(String[] args) {

        String regex = "(wqnmlgb|lj|sb|tmd|nmsl|wsnd)";

        String line = "wqnmlgb,你个lj,你个sb的,mdzz.";

        line = line.replaceAll(regex,"***");

        System.out.println(line);

    }
}
