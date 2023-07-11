import java.util.regex.Pattern;

public class String3 {
    public static int countYZ(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == 'y' || arr[i] == 'z') && (i == arr.length - 1 || !Character.isLetter(arr[i + 1]))) {
                c++;
            }
        }
        return c;
    }

    public static String withoutString(String base, String remove) {
        return Pattern.compile(remove, Pattern.CASE_INSENSITIVE).matcher(base).replaceAll("");
    }

    public static boolean equalIsNot(String str) {
        int countIS = getCount(str, "is");
        int countNOT = getCount(str, "not");
        return countIS == countNOT;
    }

    private static int getCount(String str, String contain) {
        int c = 0;
        while (str.contains(contain)) {
            c++;
            str = str.replaceFirst(contain, "");
        }
        return c;
    }

    public static boolean gHappy(String str) {
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 'g' && arr[i - 1] != 'g' && (i == arr.length - 1 || arr[i + 1] != 'g')) {
                return false;
            }
        }
        return str.length() != 1;
    }

    public static int countTriple(String str) {
        int c = 0; //общее количество повторений
        int x = 1; //счётчик количества одиночных повторений для каждого элемента в строке
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) x++;
            else if (x >= 3) {
                c += x - 2;
                x = 1;

            } else x = 1;
        }

        return x >= 3 ? c + 1 : c;
    }

    public static int sumDigits(String str) {
        char[] arr = str.toCharArray();
        int sum = 0;
        for (char a : arr) if (Character.isDigit(a)) sum += Character.digit(a, 10);
        return sum;
    }

    public static String sameEnds(String string) {
        String str1 = string.substring(0, string.length() / 2);
        String str2 = string.substring(string.length() / 2);

        while (true) {
            if (str2.contains(str1)) return str1;
            str1 = str1.substring(0, str1.length() - 1);
        }
    }

    public static String mirrorEnds(String string) {
        char[] arr = string.toCharArray();
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - i - 1]) str = arr[i] + str;
            else str = "";
        }

        return str;
    }

    public static int maxBlock(String str) {
        int c = 1;
        int t = 0;
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) c++;
            else c = 1;
            t = Math.max(t, c);
        }

        return t;
    }

    public static int sumNumbers(String str) {
        char[] arr = str.toCharArray();
        String digit = "0";
        int sum = 0;

        for (char a : arr) {
            if (Character.isDigit(a)) digit += a;
            else {
                sum += Integer.parseInt(digit);
                digit = "0";
            }
        }

        return sum + Integer.parseInt(digit);
    }

    public static String notReplace(String str) {
        return str.replaceAll(("(?<= |^|\\W)is(?= |$|\\W)"), "is not");
    }
}
