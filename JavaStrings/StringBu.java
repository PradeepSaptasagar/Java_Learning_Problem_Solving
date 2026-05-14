import java.util.*;

public class StringBu {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        System.out.println(sb);
        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert char at index 0
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // // delete the extra n
        // sb.delete(2, 4);
        // System.out.println(sb);
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb.length());
    }
}
