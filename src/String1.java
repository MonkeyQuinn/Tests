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

    public static boolean hasBad(String str) {
        return str.indexOf("bad") == 1 || str.indexOf("bad") == 0;
    }

    public static String atFirst(String str) {
        if (str.length() >= 2) {
            str = str.substring(0, 2);

        } else {
            int n = str.length();
            for (int i = 0; i < 2 - n; i++) {
                str += "@";
            }
        }

        return str;
    }

    public static String lastChars(String a, String b) {
        if (a.length() > 0) {
            a = a.substring(0, 1);

        } else {
            a = "@";
        }

        if (b.length() > 0) {
            b = b.substring(b.length() - 1);

        } else {
            b = "@";
        }

        return a + b;
    }

    public static String conCat(String a, String b) {
        if (a.length() != 0 && b.length() != 0) {
            if (a.charAt(a.length() - 1) == b.charAt(0)) {
                a = a.substring(0, a.length() - 1);
            }
        }

        return a + b;
    }

    public static String lastTwo(String str) {
        if (str.length() >= 2) {
            str = str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }

        return str;
    }

    public static String seeColor(String str) {
        if (str.indexOf("red") == 0) {
            return "red";

        } else if (str.indexOf("blue") == 0) {
            return "blue";

        } else {
            return "";
        }
    }

    public static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            String f = str.substring(0, 2);
            String l = str.substring(str.length() - 2);

            return f.equals(l);
        }

        return false;
    }

    public static String minCat(String a, String b) {
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                a = a.substring(a.length() - b.length());

            } else {
                b = b.substring(b.length() - a.length());
            }
        }

        return a + b;
    }

    public static String extraFront(String str) {
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }

        return str + str + str;
    }

    public static String startWord(String str, String word) {
        if (str.length() > 0 && str.length() >= word.length()) {
            word = word.substring(1);

            if (word.equals(str.substring(1, word.length() + 1))) {
                return str.substring(0, word.length() + 1);
            }
        }

        return "";
    }

    public static String withoutX(String str) {
        if (str.contains("x") && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.contains("x") && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static String withoutX2(String str) {
        if (str.length() >= 2) {
            for (int i = 1; i >= 0; i--) {
                if (str.charAt(i) == 'x') {
                    str = str.replaceFirst("x", "");
                }
            }

        } else {
            str = str.replaceAll("x", "");
        }

        return str;
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String without2(String str) {
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
            }
        }

        return str;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String deFront(String str) {
        if (str.length() > 2) {
            char firstLetter = str.charAt(0);
            char secondLetter = str.charAt(1);

            str = str.substring(2);

            if (secondLetter == 'b') {
                str = "b" + str;
            }

            if (firstLetter == 'a') {
                str = "a" + str;
            }

        } else {
            if (str.indexOf("b") != 1) {
                str = str.substring(0, 1);
            }

            if (str.indexOf("a") != 0) {
                str = str.substring(1);
            }
        }

        return str;
    }
}
