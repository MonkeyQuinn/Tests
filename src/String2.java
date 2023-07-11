public class String2 {
    public static String doubleChar(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s += String.valueOf(str.charAt(i)) + str.charAt(i);
        }

        return s;
    }

    public static int countHi(String str) {
        int c = 0;
        while (str.contains("hi")) {
            c++;
            str = str.replaceFirst("hi", "");
        }
        return c;
    }

    public static boolean catDog(String str) {
        int catC = getC(str, "cat");
        int dogC = getC(str, "dog");
        return catC == dogC;
    }

    private static int getC(String str, String catDog) {
        int c = 0;
        while (str.contains(catDog)) {
            c++;
            str = str.replaceFirst(catDog, "");
        }
        return c;
    }

    public static int countCode(String str) {
        int c = 0;
        while (str.matches(".*co.e.*")) {
            c++;
            str = str.replaceFirst("co.e", "");
        }
        return c;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() >= b.length()) return a.indexOf(b) == a.length() - b.length();
        return b.indexOf(a) == b.length() - a.length();
    }

    public static boolean xyzThere(String str) {
        str = str.replaceAll("\\.xyz", "");
        return str.contains("xyz");
    }

    public static boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }

    public static boolean xyBalance(String str) { //
        boolean y = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') y = false;
            if (str.charAt(i) == 'y') y = true;
        }

        return y;
    }

    public static String mixString(String a, String b) {
        int n = Math.min(a.length(), b.length());
        String s = "";

        for (int i = 0; i < n; i++) {
            s += String.valueOf(a.charAt(i)) + b.charAt(i);
        }

        if (a.length() > b.length()) s += a.substring(n);
        if (b.length() > a.length()) s += b.substring(n);

        return s;
    }

    public static String repeatEnd(String str, int n) {
        str = str.substring(str.length() - n);
        String s = "";
        for (int i = 0; i < n; i++) s += str;
        return s;
    }

    public static String repeatFront(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            str = str.substring(0, n - i);
            s += str;
        }
        return s;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String str = "";
        for (int i = 0; i < count - 1; i++) str += word + sep;
        return count == 0 ? "" : str + word;
    }

    public static boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }

    public static boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            int n = str.length() / 2;

            if (str.length() % 2 == 0) {
                str = str.substring(n - 2);
                if (str.charAt(0) != 'x') str = str.substring(1);

            } else str = str.substring(n - 1);
        }

        return str.indexOf("xyz") == 0;
    }

    public static String getSandwich(String str) {
        if (str.contains("bread") && str.replaceFirst("bread", "").contains("bread")) {
            int firstBread = str.indexOf("bread") + 5;
            int lastBread = str.lastIndexOf("bread");
            return str.substring(firstBread, lastBread);
        }

        return "";
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) return false;
        }

        return true;
    }

    public static String oneTwo(String str) {
        String s = "";

        if (str.length() % 3 != 0) {
            int i = str.length() - str.length() % 3;
            str = str.substring(0, i);
        }

        for (int i = 0; i < str.length() / 3; i++) {
            String l = str.substring(i * 3, i * 3 + 3); //Str|ing = len(6)
            l = l.substring(1) + l.charAt(0);
            s += l;
        }

        return s;
    }

    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    public static String starOut(String str) {
        while (str.contains("**")) {
            str = str.replaceAll("\\*\\*", "*");
        }

        return str.replaceAll("(.|)\\*(.|)", "");
    }

    public static String plusOut(String str, String word) {
        String res = "";
        int i = 0;

        while (i < str.length()) {
            if (str.substring(i).startsWith(word)) {
                res += word;
                i += word.length();

            } else {
                res += "+";
                i++;
            }
        }

        return res;
    }

    public static String wordEnds(String str, String word) {
        int strLen = str.length();
        int wordLen = word.length();
        String s = "";

        for (int i = 0; i < strLen - wordLen + 1; i++) {
            String tmp = str.substring(i, i + wordLen);
            if (i > 0 && tmp.equals(word)) s += str.substring(i - 1, i);
            if (i < strLen - wordLen && tmp.equals(word)) s += str.substring(i + wordLen, i + wordLen + 1);
        }
        return s;
    }
}
