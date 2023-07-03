public class String1 {
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static String extraEnd(String str) {
        str = str.substring(str.length() - 2);
        String s = "";

        for (int i = 0; i < 3; i++) {
            s += str;
        }

        return s;
    }

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);

        } else {
            return str;
        }
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String comboString(String a, String b) {
        String longS = b;
        String shortS = a;

        if (a.length() > b.length()) {
            longS = a;
            shortS = b;
        }

        return shortS + longS + shortS;
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0));

        } else {
            return String.valueOf(str.charAt(str.length() - 1));
        }
    }

    public static String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }

        return "";
    }

    public static String middleTwo(String str) {
        int y = str.length() / 2;
        int x = y - 1;

        return String.valueOf(str.charAt(x)) + str.charAt(y);
    }

    public static boolean endsLy(String str) {
        if (str.contains("ly")) {
            return str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y';

        } else {
            return false;
        }
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static String twoChar(String str, int index) {
        if (index > 0 && str.length() > index + 1) {
            return str.substring(index, index + 2);

        } else {
            return str.substring(0, 2);
        }
    }

    public static String middleThree(String str) {
        if (str.length() > 3) {
            int x = str.length() / 2 + 1;
            str = str.substring(x - 2, x + 1);
        }

        return str;
    }
}
