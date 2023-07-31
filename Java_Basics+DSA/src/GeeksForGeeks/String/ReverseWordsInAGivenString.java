package GeeksForGeeks.String;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S) );
    }
    private static String reverseWords(String S)
    {
        // code here
        StringBuilder sb = new StringBuilder();
        String arr[] = S.split("\\.");
        for(int i = arr.length-1;i>0;i--)
        {
            sb.append(arr[i]+".");
        }
        sb.append(arr[0]);
        return sb.toString() ;
    }

}
