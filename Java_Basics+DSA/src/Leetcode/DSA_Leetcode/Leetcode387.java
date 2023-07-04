package Leetcode.DSA_Leetcode;

public class Leetcode387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (s.indexOf(letter) == s.lastIndexOf(letter)) {
                return i;
            }
        }
        return -1;
    }
}
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

