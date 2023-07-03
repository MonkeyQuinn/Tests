public class Warmup1 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;

        } else {
            return !weekday;
        }
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;

        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static String backAround(String str) {
        String l = str.substring(str.length() - 1);
        return l + str + l;
    }

    public static boolean startHi(String str) {
        str = str.toLowerCase();
        str += " ";
        return str.startsWith("hi ");
    }

    public static boolean hasTeen(int a, int b, int c) {
        int[] arr = {a, b, c};

        for (int i : arr) {
            if (i >= 13 && i <= 19) {
                return true;
            }
        }

        return false;
    }

    public static boolean mixStart(String str) {
        if (!str.equals("")) {
            return str.substring(1).startsWith("ix");

        } else {
            return false;
        }
    }

    public static int close10(int a, int b) {
        int a10 = Math.abs(a - 10);
        int b10 = Math.abs(b - 10);

        if (a10 > b10) {
            return b;

        } else if (b10 > a10) {
            return a;

        } else {
            return 0;
        }
    }

    public static boolean stringE(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                c++;
            }
        }

        return c >= 1 && c <= 3;
    }

    public static String everyNth(String str, int n) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                s += str.charAt(i);
            }
        }

        return s;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            return hour < 7 || hour > 20;
        }

        return false;
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            return (a < 0 || b < 0) && (a >= 0 || b >= 0);

        } else {
            return a < 0 && b < 0;
        }
    }

    public static String frontBack(String str) {
        char[] arr = str.toCharArray();

        if (str.length() > 1) {
            char f = arr[0];
            char l = arr[arr.length - 1];
            arr[0] = l;
            arr[arr.length - 1] = f;
        }

        String s = "";

        for (char a : arr) {
            s += a;
        }

        return s;
    }

    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100);
    }

    public static boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
    }

    public static String startOz(String str) {
        String s = "";

        if (str.startsWith("o")) {
            s += "o";
        }

        if (str.length() >= 2 && str.startsWith("z", 1)) {
            s += "z";
        }

        return s;
    }

    public static boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;

        } else {
            return (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        }
    }

    public static boolean lastDigit(int a, int b) {
        a += 10;
        b += 10;

        return a % 10 == b % 10;
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;

        } else {
            return (a + b) * 2;
        }
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;

        } else {
            return a + b == 10;
        }
    }

    public static String notString(String str) {
        if (!str.startsWith("not")) {
            str = "not " + str;
        }

        return str;
    }

    public static String front3(String str) {
        String s = "";

        if (str.length() >= 3) {
            str = str.substring(0, 3);
        }

        for (int i = 0; i < 3; i++) {
            s += str;
        }

        return s;
    }

    public static String front22(String str) {
        String s = str;

        if (str.length() >= 2) {
            s = str.substring(0, 2);
        }

        return s + str + s;
    }

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }

        return str;
    }

    public static int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int max1020(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (max >= 10 && max <= 20) {
            return max;

        } else if (min >= 10 && min <= 20) {
            return min;

        } else {
            return 0;
        }
    }

    public static String endUp(String str) {
        if (str.length() >= 3) {
            String last3 = str.substring(str.length() - 3).toUpperCase();
            return str.substring(0, str.length() - 3) + last3;

        } else {
            return str.toUpperCase();
        }
    }
}
