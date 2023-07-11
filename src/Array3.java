import java.util.Arrays;

public class Array3 {
    public static int maxSpan(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j >= 0; j--)
                if (nums[i] == nums[j]) x = Math.max(x, j - i + 1);
        return x;
    }

    public static int[] fix34(int[] nums) {
        int x;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                x = nums[i + 1];
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        nums[j] = x;
                        break;
                    }
                }
                nums[i + 1] = 4;
            }
        }
        return nums;
    }

    public static int[] fix45(int[] nums) {
        int x;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                x = nums[i + 1];
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        nums[j] = x;
                        break;
                    }
                }
                nums[i + 1] = 5;
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int x = Arrays.stream(nums).limit(nums.length - i).sum();
            int y = Arrays.stream(nums).skip(nums.length - i).sum();
            if (x == y) return true;
        }
        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean b = false;
        for (int i : inner) {
            for (int j : outer) {
                if (i == j) {
                    b = true;
                    break;
                }
                b = false;
            }
            if (!b) return false;
        }
        return true;
    }

    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int x = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = x;
            x = x == n ? 1 : x + 1;
        }
        x = 0; //+n
        int y = n - 1; //-1

        for (int i = 0; i < n - 1; i++) {
            for (int j = x; j < y; j++) {
                arr[j] = 0;
            }
            x += n;
            y += n - 1;
        }

        return arr;
    }

    public static int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];
        int j = 1;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            if (arr[i] - x == 1) {
                j = 1;
                x = arr[i];

            } else {
                j++;
            }
        }
        return arr;
    }

    public static int maxMirror(int[] nums) {
        int n = nums.length;
        int m = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = n - 1; i + c < n && j > -1; j--) {
                if (nums[i + c] == nums[j]) c++;

                else if (c > 0) {
                    m = Math.max(c, m);
                    c = 0;
                }
            }
            m = Math.max(c, m);
        }
        return m;
    }

    public static int countClumps(int[] nums) {
        int c = 0;
        boolean b = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) b = true;
            else if (nums[i - 1] == nums[i] && b) {
                b = false;
                c++;
            }
        }
        return c;
    }
}
