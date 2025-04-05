package Easy;

public class BackSpace {
    static boolean backspaceCompare(String s, String t) {
        String s1 = createNewString(s);
        String t1 = createNewString(t);

        return t1.equals(s1);
    }

    private static String createNewString(String old) {
        StringBuilder ans = new StringBuilder();
        char charecter;

        for (int i = 0; i < old.length(); i++) {
            charecter = old.charAt(i);

            if (!ans.isEmpty() && charecter == '#') {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(charecter);
            }
        }

        return ans.toString();
    }
}
