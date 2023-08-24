package GeeksForGeeks.ProblemOfTheDay;

public class ReverseAString {
    public static void main(String[] args) {
        String s="Geeks";
        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        String a = "";
        for (int i=0;i<s.length();i++){
            a=s.charAt(i) +a;
        }
        return a;
    }
}
