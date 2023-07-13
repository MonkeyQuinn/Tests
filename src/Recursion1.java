public class Recursion1 {
    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int bunnyEars2(int bunnies) {
        return bunnies == 0 ? 0 : bunnies % 2 == 0 ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
    }

    public static int triangle(int rows) {
        return rows == 0 ? 0 : rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {
        return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
    }

    public static int count7(int n) {
        return n == 0 ? 0 : n == 7 || n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
    }

    public static int count8(int n) {
        if (n == 0)
            return 0;

        if (n == 8)
            return 1;

        if (n % 10 == 8 && n / 10 % 10 == 8)
            return 2 + count8(n / 10);

        if (n % 10 == 8)
            return 1 + count8(n / 10);

        return count8(n / 10);
    }

    public static int powerN(int base, int n) {
        if (n == 1)
            return base;

        return base * powerN(base, n - 1);
    }

    //Так как задания countX и countHi практически полностью идентичны (там всего-лишь отличается подстрока,
    //чьё количество необходимо подсчитать), то я реализовал общий для них метод, в который дополнительно
    //передаётся подсчитываемая подстрока.
    //Сюда ещё приплетаются задания countAbc и count11, они будут чуть ниже
    private static int countXHI(String str, String replacement) {
        if (!str.contains(replacement))
            return 0;

        return 1 + countXHI(str.replaceFirst(replacement, ""), replacement);
    }

    public static int countX(String str) {
        return countXHI(str, "x");
    }

    public static int countHi(String str) {
        return countXHI(str, "hi");
    }

    public static String changeXY(String str) {
        return str.contains("x") ? changeXY(str.replaceFirst("x", "y")) : str;
        //Что-то мне подсказывает, что это не то, решение, которое ожидали в CodingBat.
        //Хотя для такого я обычно строковый метод replaceAll использую
    }

    public static String changePi(String str) {
        return str.replaceAll("pi", "3.14");
        //По сути задание такое же, как и changeXY
    }

    public static String noX(String str) {
        return str.replaceAll("x", "");
    }

    public static boolean array6(int[] nums, int index) {
        return index < nums.length && (nums[index] == 6 || array6(nums, index + 1));
    }

    public static int array11(int[] nums, int index) {
        if (index == nums.length)
            return 0;

        if (nums[index] == 11)
            return 1 + array11(nums, index + 1);

        return array11(nums, index + 1);
    }

    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1)
            return false;

        if (nums[index + 1] == nums[index] * 10)
            return true;

        return array220(nums, index + 1);
    }

    public static String allStar(String str) {
        if (str.isEmpty())
            return "";

        if (str.length() == 1)
            return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public static String pairStar(String str) {
        if (str.isEmpty())
            return "";

        if (str.length() >= 2 && str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));

        return str.charAt(0) + pairStar(str.substring(1));
    }

    public static String endX(String str) {
        if (str.replaceAll("x", "").isEmpty() || !str.contains("x"))
            return str;

        return endX(str.replaceFirst("x", "")) + "x";
    }

    public static int countPairs(String str) {
        if (str.isEmpty())
            return 0;

        if (str.length() >= 3 && str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));

        return countPairs(str.substring(1));
    }

    public static int countAbc(String str) {
        return countXHI(str, "abc") + countXHI(str, "aba");
    }

    public static int count11(String str) {
        return countXHI(str, "11");
    }

    public static String stringClean(String str) {
        if (str.isEmpty())
            return "";

        if (str.length() == 1)
            return str;

        if (str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));

        return str.charAt(0) + stringClean(str.substring(1));
    }

    public static int countHi2(String str) {
        if (str.length() < 2)
            return 0;

        if (str.startsWith("xhi"))
            return countHi2(str.substring(3));

        if (str.startsWith("hi"))
            return 1 + countHi2(str.substring(2));

        return countHi2(str.substring(1));
    }

    public static String parenBit(String str) {
        if (str.isEmpty())
            return str;

        if (str.startsWith("(")) {
            if (str.endsWith(")"))
                return str;

            else
                return parenBit(str.substring(0, str.length() - 1));

        } else
            return parenBit(str.substring(1));
    }

    public static boolean nestParen(String str) {
        if (str.isEmpty())
            return true;

        if (str.length() % 2 != 0)
            return false;

        if (str.startsWith("(") && str.endsWith(")"))
            return str.length() == 2 || nestParen(str.substring(1, str.length() - 1));

        return false;
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length())
            return 0;

        if (str.startsWith(sub))
            return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0)
            return true;

        if (str.length() < sub.length())
            return false;

        if (str.startsWith(sub))
            return strCopies(str.substring(1), sub, n - 1);

        return strCopies(str.substring(1), sub, n);
    }

    public static int strDist(String str, String sub) {
        if (str.isEmpty())
            return 0;

        if (str.startsWith(sub)) {
            if (str.endsWith(sub))
                return str.length();

            else
                return strDist(str.substring(0, str.length() - 1), sub);

        } else
            return strDist(str.substring(1), sub);
    }
}
