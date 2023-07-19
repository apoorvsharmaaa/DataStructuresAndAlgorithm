package GeeksForGeeks.ProblemOfTheDay;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String S = "zxvczbtxyzvy";
        System.out.println(nonrepeatingCharacter(S));
    }

    private static char nonrepeatingCharacter(String s) {
        int l = s.length();
        for (int i =0;i<l;i++){
            for (int j = i+1;j<l;j++){
               if(s.charAt(i)==s.charAt(j)){
                   i++;
               }

            }
            return s.charAt(i);


        }
        return '$';
    }
}
