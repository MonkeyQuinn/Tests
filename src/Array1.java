import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && (nums[0] == nums[nums.length - 1]);
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int sum3(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return sum;
    }

    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;

        return nums;
    }

    public static int[] reverse3(int[] nums) {
        int[] reverse = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            reverse[i] = nums[nums.length - i - 1];
        }

        return reverse;
    }

    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public static int sum2(int[] nums) {
        if (nums.length > 1) {
            return nums[0] + nums[1];

        } else if (nums.length > 0) {
            return nums[0];

        } else {
            return 0;
        }
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static boolean has23(int[] nums) {
        for (int n : nums) {
            if (n == 2 || n == 3) return true;
        }

        return false;
    }

    public static boolean no23(int[] nums) {
        for (int n : nums) {
            if (n == 2 || n == 3) return false;
        }

        return true;
    }

    public static int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    public static boolean double23(int[] nums) {
        if (nums.length >= 2) {
            int count2 = 0;
            int count3 = 0;

            for (int n : nums) {
                if (n == 2) {
                    count2++;

                } else if (n == 3) {
                    count3++;
                }
            }

            return count2 == 2 || count3 == 2;
        }

        return false;
    }

    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }

        return nums;
    }

    public static int start1(int[] a, int[] b) {
        int c = 0;

        if (a.length > 0 && a[0] == 1) {
            c++;
        }

        if (b.length > 0 && b[0] == 1) {
            c++;
        }

        return c;
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int aSum = 0;
        int bSum = 0;

        for (int i : a) {
            aSum += i;
        }

        for (int i : b) {
            bSum += i;
        }

        if (aSum >= bSum) {
            return a;

        } else {
            return b;
        }
    }

    public static int[] makeMiddle(int[] nums) {
        int x = nums.length / 2;
        return new int[]{nums[x - 1], nums[x]};
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] x = new int[a.length + b.length];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
            c++;
        }

        for (int j : b) {
            x[c++] = j;
        }

        return x;
    }

    public static int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];

        nums[0] = last;
        nums[nums.length - 1] = first;

        return nums;
    }

    public static int[] midThree(int[] nums) {
        int x = (nums.length / 2);
        return new int[]{nums[x - 1], nums[x], nums[x + 1]};
    }

    public static int maxTriple(int[] nums) {
        int max = nums[0];

        if (nums.length > 1) {
            int mid = nums[nums.length / 2];
            int last = nums[nums.length - 1];
            max = Math.max(max, Math.max(mid, last));
        }

        return max;
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length > 2) {
            return new int[]{nums[0], nums[1]};
        }

        return nums;
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            for (int i = 0; i < 2; i++)
                if (nums[i] == 1 && nums[i + 1] == 3) return true;

            return nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
        }

        return false;
    }

    public static int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];

        if (a.length >= 1) {
            arr[0] = a[0];

            if (a.length >= 2) {
                arr[1] = a[1];

            } else if (b.length >= 1) {
                arr[1] = b[0];
            }

        } else if (b.length >= 1) {
            arr[0] = b[0];

            if (b.length >= 2) {
                arr[1] = b[1];
            }
        }

        return arr;
    }

    public static int[] front11(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();

        if (a.length > 0)
            list.add(a[0]);

        if (b.length > 0)
            list.add(b[0]);

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}