import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
//        System.out.println('z'-'a');
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}