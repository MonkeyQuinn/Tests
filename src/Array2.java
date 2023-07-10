import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Array2 {
    public static int countEvens(int[] nums) {
        return (int) Arrays.stream(nums).filter(x -> x % 2 == 0).count();
    }

    public static int bigDiff(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        return max - min;
    }

    public static int centeredAverage(int[] nums) {
        int[] arr = Arrays.stream(nums).sorted().skip(1).toArray();
        arr = Arrays.stream(arr).limit(arr.length - 1).toArray();
        return (int) Arrays.stream(arr).average().getAsDouble();
    }

    public static int sum13(int[] nums) {
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) if (nums[i] == 13) nums[i + 1] = 0;
        return Arrays.stream(nums).filter(x -> x != 13).sum();
    }

    public static int sum67(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            if (nums[i] == 6) {
                for (; i < nums.length; i++) {
                    if (nums[i] != 7) {
                        val += nums[i];

                    } else {
                        val = 0;
                        break;
                    }
                }

            } else {
                sum += nums[i];
            }

            sum += val;
        }

        return sum;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }

        return false;
    }

    public static boolean lucky13(int[] nums) {
        return Arrays.stream(nums).filter(x -> x == 1 || x == 3).count() == 0;
    }

    public static boolean sum28(int[] nums) {
        return Arrays.stream(nums).filter(x -> x == 2).sum() == 8;
    }

    public static boolean more14(int[] nums) {
        long unoCount = Arrays.stream(nums).filter(x -> x == 1).count();
        long cuatroCount = Arrays.stream(nums).filter(x -> x == 4).count();
        return unoCount > cuatroCount;
    }

    public static int[] fizzArray(int n) {
        return IntStream.range(0, n).toArray();
    }

    public static boolean only14(int[] nums) {
        long unoCount = Arrays.stream(nums).filter(x -> x == 1).count();
        long cuatroCount = Arrays.stream(nums).filter(x -> x == 4).count();
        return nums.length == 0 || nums.length == unoCount + cuatroCount;
    }

    public static String[] fizzArray2(int n) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(String.valueOf(i));
        }
        return arr.toArray(new String[0]);
    }

    public static boolean no14(int[] nums) {
        long unoCount = Arrays.stream(nums).filter(x -> x == 1).count();
        long cuatroCount = Arrays.stream(nums).filter(x -> x == 4).count();
        return unoCount == 0 || cuatroCount == 0;
    }

    public static boolean isEverywhere(int[] nums, int val) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr1.add(nums[i]);

            } else {
                arr2.add(nums[i]);
            }
        }

        return arr1.stream().filter(x -> x == val).toArray().length == arr1.size() || arr2.stream().filter(x -> x == val).toArray().length == arr2.size();
    }

    public static boolean either24(int[] nums) {
        boolean b2 = false;
        boolean b3 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            b2 = nums[i] == 2 && nums[i + 1] == 2 || b2;
            b3 = nums[i] == 4 && nums[i + 1] == 4 || b3;
        }

        return !b2 && b3 || b2 && !b3;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int abs = Math.abs(nums1[i] - nums2[i]);
            count += abs == 1 ? 1 : abs == 2 ? 1 : 0;
        }

        return count;
    }

    public static boolean has77(int[] nums) {
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7)) {
                    return true;
                }
            }

            return nums[nums.length - 1] == 7 && nums[nums.length - 2] == 7;
        }

        return false;
    }

    public static boolean has12(int[] nums) {
        boolean b = false;
        for (int n : nums) {
            if (n == 1 && !b) {
                b = true;

            } else if (n == 2 && b) {
                return true;
            }
        }

        return false;
    }

    public static boolean modThree(int[] nums) {
        return true;
    }
}