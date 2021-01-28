import java.util.Arrays;
import java.util.Comparator;

public class ThirdGreatestString {

    //String[] strArr = {"ABCD", "AB", "ABCDEFG", "ABC", "A", "ABCDE", "ABCDEF", "ABCDEFGHIJ"};

    static String sort(String[]strArr) {
        Arrays.sort(strArr, Comparator.comparing(String::length).reversed());
        System.out.println(strArr[2]);
        return strArr[2];
    }

    public static void main(String[] args) {
    }
}