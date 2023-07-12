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
        if (n == 0) return 0;
        else if (n == 8) return 1;
        else if (n % 10 == 8 && n / 10 % 10 == 8) return 2 + count8(n / 10);
        else if (n % 10 == 8) return 1 + count8(n / 10);
        return count8(n / 10);
    }

    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }

    //Так как задания countX и countHi практически полностью идентичны (там всего-лишь отличается подстрока,
    //чьё количество необходимо подсчитать), то я реализовал общий для них метод, в который дополнительно
    //передаётся подсчитываемая подстрока
    private static int countXHI(String str, String replacement) {
        if (!str.contains(replacement)) return 0;
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
        //Что-то мне подсказывает, что это не то, решение, которое ожидали в CondingBat.
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
}
