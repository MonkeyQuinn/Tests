public class Warmup2 {
    public static String stringTimes(String str, int n) {
        String s = "";

        for (int i = 0; i < n; i++) {
            s += str;
        }

        return s;
    }

    public static boolean doubleX(String str) {
        if (str.contains("x")) {
            int x1 = str.indexOf("x");
            str = str.replaceFirst("x", "_");
            int x2 = str.indexOf("x");

            return x2 != -1 && x2 - x1 == 1;
        }

        return false;
    }

    public static int last2(String str) {
        int c = 0;

        if (str.length() >= 2) {
            String end = str.substring(str.length() - 2);

            for (int i = 0; i < str.length() - 2; i++) {
                String sub = str.substring(i, i + 2);

                if (sub.equals(end)) {
                    c++;
                }
            }
        }

        return c;
    }

    public static boolean array123(int[] nums) {
        int x = 0;

        for (int n : nums) {
            if (n - x == 1) {
                x = n;

            } else if (n == 1) {
                x = n;

            } else {
                x = 0;
            }

            if (x == 3) {
                return true;
            }
        }

        return false;
    }

    public static String altPairs(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;

            if (end > str.length()) {
                end = str.length();
            }
            s += str.substring(i, end);
        }

        return s;
    }

    //[1, 1, 2, 2, 2, 1]
    public static boolean noTriples(int[] nums) {
        int c = 1;

        if (nums.length > 0) {
            int x = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == x) {
                    c++;

                } else if (c != 3) {
                    c = 1;
                    x = nums[i];
                }
            }
        }

        return c < 3;
    }

    public static String frontTimes(String str, int n) {
        String s = "";

        if (str.length() >= 3) {
            str = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            s += str;
        }

        return s;
    }

    public static String stringBits(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                s += str.charAt(i);
            }
        }

        return s;
    }

    public static int arrayCount9(int[] nums) {
        int c = 0;

        for (int n : nums) {
            if (n == 9) {
                c++;
            }
        }

        return c;
    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int c = 0;

        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if (subA.equals(subB)) {
                c++;
            }
        }

        return c;
    }

    public static String stringYak(String str) {
        return str.replaceAll("yak", "");
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }

        return false;
    }

    public static int countXX(String str) {
        int c = 0;

        if (str.contains("xx")) {
            int n = str.length();

            for (int i = 0; i < n; i++) {
                if (str.contains("xx")) {
                    c++;
                    str = str.substring(str.indexOf("xx"));
                    str = str.substring(1);
                }
            }
        }

        return c;
    }

    public static String stringSplosion(String str) {
        String s = "";

        for (int i = 0; i < str.length() + 1; i++) {
            s += str.substring(0, i);
        }

        return s;
    }

    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 4 && nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    public static String stringX(String str) {
        if (str.length() > 3) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            str = str.substring(1, str.length() - 1);
            str = first + str.replaceAll("x", "") + last;
        }
        return str;
    }

    public static int array667(int[] nums) {
        int c = 0;

        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    c++;
                }
            }
        }
        return c;
    }
}
