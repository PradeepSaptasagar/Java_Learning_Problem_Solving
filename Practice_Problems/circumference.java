import java.util.*;
import java.lang.Math;

public class circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);
    }
}
