public class Logic1 {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;

        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;

        } else if (you >= 8 || date >= 8) {
            return 2;

        } else {
            return 1;
        }
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;

        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicket = isBirthday ? 65 : 60;
        int smallTicket = isBirthday ? 85 : 80;

        if (speed <= noTicket) {
            return 0;

        } else if (speed <= smallTicket) {
            return 1;

        } else {
            return 2;
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 19) return 20;

        return sum;
    }

    public static String alarmClock(int day, boolean vacation) {
        String weekday = vacation ? "10:00" : "7:00";
        String weekend = vacation ? "off" : "10:00";

        if (day == 0 || day == 6) return weekend;

        return weekday;
    }

    public static boolean love6(int a, int b) {
        int[] sixArr = {a, b, a + b, Math.abs(a - b)};

        for (int i : sixArr) {
            if (i == 6) {
                return true;
            }
        }

        return false;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0;
    }

    public static boolean more20(int n) {
        return (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
    }

    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) return false;
        else if (n % 3 == 0) return true;
        else return n % 5 == 0;
    }

    public static boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public static boolean nearTen(int num) {
        return num % 10 == 9 || num % 10 == 8 || num % 10 == 1 || num % 10 == 2 || num % 10 == 0;
    }

    public static int teenSum(int a, int b) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;

        } else if (isMorning && isMom) {
            return true;

        } else return !isMorning;
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (tea >= candy * 2 || candy >= tea * 2) return 2;
        else return 1;
    }

    public static String fizzString(String str) {
        if (str.length() > 0) {
            String s = "";
            boolean b = false;

            if (str.charAt(0) == 'f') {
                s += "Fizz";
                b = true;
            }

            if (str.charAt(str.length() - 1) == 'b') {
                s += "Buzz";
                b = true;
            }

            if (b) {
                str = s;
            }
        }

        return str;
    }

    public static String fizzString2(int n) {
        if (n % 3 != 0 && n % 5 != 0) return n + "!";
        String str = "";
        if (n % 3 == 0) str += "Fizz";
        if (n % 5 == 0) str += "Buzz";
        return str + "!";
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) return true;
        if (a + c == b) return true;
        return b + c == a;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : c > b && b > a;
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles && die1 == die2 && die1 != 6) sum++;
        else if (noDoubles && die1 == 6) sum = 7;
        return sum;
    }

    public static int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        return Math.max(a, b);
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && a == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && a == c) return 20;
        if (a == b || a == c || b == c) return 10;
        return 0;
    }

    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bcc = b + c;

        if (ab == 10 || ac == 10 | bcc == 10) return 10;
        if (ab - ac == 10 || ab - bcc == 10) return 5;
        return 0;
    }

    public static boolean shareDigit(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        for (int i = 0; i < aStr.length(); i++) {
            for (int j = 0; j < bStr.length(); j++) {
                if (aStr.charAt(i) == bStr.charAt(j))
                    return true;
            }
        }

        return false;
    }

    public static int sumLimit(int a, int b) {
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(a + b);

        if (sumStr.length() == aStr.length()) return Integer.parseInt(sumStr);
        return a;
    }
}
