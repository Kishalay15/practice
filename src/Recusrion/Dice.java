package Recusrion;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
//        allCombinations("", 4);
        System.out.println(allCombinationsInList("", 4));
        System.out.println(allCombinationsCount(4));
    }

    static void allCombinations(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            allCombinations(p + i, target - i);
        }
    }

    static List<String> allCombinationsInList(String p, int target) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(allCombinationsInList(p + i, target - i));
        }

        return ans;
    }

    static int allCombinationsCount(int target) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i <= 6; i++) {

            count += allCombinationsCount(target - i);
        }

        return count;
    }
}
