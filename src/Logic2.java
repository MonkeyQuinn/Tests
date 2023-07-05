import java.util.Arrays;

public class Logic2 {
    public static boolean makeBricks(int small, int big, int goal) {
        int brickSum = 0;
        int[][] brick = {
                {big, small},
                {5, 1}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < brick[0][i]; j++) { //сначала цикл пройдётся по big, затем уже по small
                brickSum += brick[1][i]; //прибавление дюймов

                if (brickSum > goal) { //проверка допустимого диапазона дюймов
                    brickSum -= brick[1][i];
                    break;

                } else if (brickSum == goal) break;
            }
        }

//        for (int i = 0; i < big; i++) {
//            if (brickSum > goal) {
//                brickSum--;
//                break;
//
//            } else if (brickSum == goal) break;
//
//            brickSum += 5;
//        }
//
//        for (int i = 0; i < small; i++) {
//            if (brickSum > goal) {
//                brickSum--;
//                break;
//
//            } else if (brickSum == goal) break;
//
//            brickSum += 1;
//        }

        return brickSum == goal;
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        return a + b + c;
    }

    public static int luckySum(int a, int b, int c) {
        int[] arr = {a, b, c};
        int sum = 0;
        boolean y = true;

        for (int i : arr) {
            if (i == 13) y = false;
            if (y) sum += i;
        }

        return sum;
    }

    public static int noTeenSum(int a, int b, int c) {
        int[] arr = {a, b, c};
        int sum = 0;

        for (int i : arr) {
            if ((i < 13 || i > 19) || (i == 15 || i == 16)) {
                sum += i;
            }
        }

        return sum;
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int n) {
        boolean y = true;

        if (n % 10 >= 5) {
            while (y) {
                if (n % 10 >= 5) n++;
                else y = false;
            }

        } else {
            while (y) {
                if (n % 10 < 5 && n % 10 != 0) n--;
                else y = false;
            }
        }

        return n;
    }

    public static boolean closeFar(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bcc = Math.abs(b - c);

        if (ab <= 1 && bcc >= 2 && ac >= 2) return true;
        return ac <= 1 && bcc >= 2 && ab >= 2;
    }

    public static int blackjack(int a, int b) {
        int a21 = a <= 21 ? Math.abs(a - 21) : a;
        int b21 = b <= 21 ? Math.abs(b - 21) : b;

        if (a > 21 && b > 21) return 0;
        if (a21 <= b21) return a;
        return b;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1] - arr[0] == arr[2] - arr[1];
    }

    public static int makeChocolate(int small, int big, int goal) {
        int barSum;
        int minus;

        minus = getSum(0, big, goal, 5);
        barSum = getSum(minus, small, goal, 1);

        return barSum == goal ? barSum - minus : -1;
    }

    private static int getSum(int barSum, int bar, int goal, int kg) {
        for (int i = 0; i < bar; i++) {
            barSum += kg;

            if (barSum > goal) {
                barSum -= kg;
                break;

            } else if (barSum == goal) break;
        }

        return barSum;
    }
}
