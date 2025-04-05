package Recusrion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        //permutations("", "abcd");
        //System.out.println(permutationsArray("", "abc"));
        //System.out.println(countPossiblePermutations("", "abcd"));
        System.out.println(letterCombinations("23"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutations(first + c + second, up.substring(1));
        }
    }

    static ArrayList<String> permutationsArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char c = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);

            ans.addAll(permutationsArray((first + c + second), up.substring(1)));
        }

        return ans;
    }

    static int countPossiblePermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char c = up.charAt(0);
        int count = 0;

        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);

            count += countPossiblePermutations(first + c + second, up.substring(1));
        }

        return count;
    }

    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<String>();
        return phonePad("", digits);
    }

    static ArrayList<String> phonePad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digits = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digits - 2) * 3; i < (digits - 1) * 3; i++) {
            char c = (char) ('a' + i);
            ans.addAll(phonePad(p + c, up.substring(1)));
        }

        return ans;
    }

}
