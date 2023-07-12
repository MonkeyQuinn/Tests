import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AP1 {
    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) if (scores[i + 1] < scores[i]) return false;
        return true;
    }

    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) if (scores[i] == 100 && scores[i + 1] == 100) return true;
        return false;
    }

    public static boolean scoresClump(int[] scores) {
        int c = 1;
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (c == 3) return true;
                if (scores[j] - scores[i] <= 2) c++;
                else {
                    c = 1;
                    break;
                }
            }
        }
        return false;
    }

    public static int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length / 2), average(scores, scores.length / 2, scores.length));
    }

    private static int average(int[] arr, int start, int end) {
        return (int) Arrays.stream(arr).skip(start).limit(end).average().orElse(0);
    }

    public static int wordsCount(String[] words, int len) {
        int c = 0;
        for (String w : words) if (w.length() == len) c++;
        return c;
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];
        System.arraycopy(words, 0, arr, 0, n);
        return arr;
    }

    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String w : words) if (w.length() != len) list.add(w);
        return list;
    }

    public static boolean hasOne(int n) {
        return String.valueOf(n).contains("1");
    }

    public static boolean dividesSelf(int n) {
        if (!String.valueOf(n).contains("0")) {
            int[] arr = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
            for (int a : arr) if (n % a != 0) return false;
            return true;
        }

        return false;
    }

    public static int[] copyEvens(int[] nums, int count) {
        String str = "";
        int c = 0;

        for (int i = 0; i < nums.length && c < count; i++)
            if (nums[i] % 2 == 0) {
                str += nums[i];
                c++;
            }

        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] copyEndy(int[] nums, int count) {
        String str = "";
        int c = 0;

        for (int i = 0; i < nums.length && c < count; i++)
            if (nums[i] % 2 == 0 && (nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
                str += nums[i] + " ";
                c++;
            }

        return Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static int matchUp(String[] a, String[] b) {
        int c = 0;
        for (int i = 0; i < a.length && i < b.length; i++)
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) c++;
        return c;
    }

    public static int scoreUp(String[] key, String[] answers) {
        int c = 0;
        for (int i = 0; i < key.length && 1 < answers.length; i++) {
            if (Objects.equals(answers[i], key[i])) c += 4;
            else if (!Objects.equals(answers[i], "?")) c--;
        }
        return c;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int n = (int) Arrays.stream(words).filter(x -> !Objects.equals(x, target)).count();
        String[] arr = new String[n];

        int j = 0;
        for (String w : words) {
            if (!Objects.equals(w, target)) {
                arr[j] = w;
                j++;
            }
        }

        return arr;

        //Более простое решение, но его не принимает CodingBat из-за метода toList()
        // return Arrays.stream(words).filter(x -> !Objects.equals(x, target)).toList().toArray(new String[0]);
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return Arrays.stream(a).filter(x -> x % 10 == 0).max().orElse(0) + Arrays.stream(b).filter(x -> x % 10 == 0).max().orElse(0);
    }

    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) sum += Math.abs(heights[i] - heights[i + 1]);
        return sum;
    }

    public static int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int r = Math.abs(heights[i] - heights[i + 1]);
            if (heights[i + 1] > heights[i]) r *= 2;
            sum += r;
        }
        return sum;
    }

    public static int bigHeights(int[] heights, int start, int end) {
        int c = 0;
        for (int i = start; i < end; i++) if (Math.abs(heights[i] - heights[i + 1]) >= 5) c++;
        return c;
    }

    public static int userCompare(String aName, int aId, String bName, int bId) {
        int x = Integer.compare(aName.compareTo(bName), 0);
        if (x == 0) x = Integer.compare(aId, bId);
        return x;
    }

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int aI = 0;
        int bI = 0;

        for (int i = 0; i < n; i++) {
            if (a[aI].compareTo(b[bI]) < 0) {
                arr[i] = a[aI];
                aI++;

            } else if (a[aI].compareTo(b[bI]) > 0) {
                arr[i] = b[bI];
                bI++;

            } else {
                arr[i] = a[aI];
                aI++;
                bI++;
            }
        }
        return arr;
    }

    public static int commonTwo(String[] a, String[] b) {
        int c = 0;
        String str = "";

        for (String bc : b) {
            for (String ac : a) {
                if (ac.equals(bc) && !str.contains(ac)) {
                    str += ac;
                    c++;
                }
            }
        }
        return c;
    }
}

