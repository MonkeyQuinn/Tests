public class Recursion2 {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupSum(start + 1, nums, target - nums[start]))
            return true;

        return groupSum(start + 1, nums, target);
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupSum6(start + 1, nums, target - nums[start]))
            return true;

        return nums[start] != 6 && groupSum6(start + 1, nums, target);
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupNoAdj(start + 2, nums, target - nums[start]))
            return true;

        return groupNoAdj(start + 1, nums, target);
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (nums[start] % 5 == 0) {
            if (start != nums.length - 1 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);

            return groupSum5(start + 1, nums, target - nums[start]);
        }

        if (groupSum5(start + 1, nums, target - nums[start]))
            return true;

        return groupSum5(start + 1, nums, target);
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        int i = start;
        int sum = 0;

        while (i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }

        if (groupSumClump(i, nums, target - sum))
            return true;

        return groupSumClump(i, nums, target);
    }

    public static boolean splitArray(int[] nums) {
        return splitArrayLoop(nums, 0, 0, 0);
    }

    private static boolean splitArrayLoop(int[] nums, int i, int sum1, int sum2) {
        if (i >= nums.length)
            return sum1 == sum2;

        return splitArrayLoop(nums, i + 1, sum1 + nums[i], sum2) ||
                splitArrayLoop(nums, i + 1, sum1, sum2 + nums[i]);
    }

    public static boolean splitOdd10(int[] nums) {
        return splitOdd10Loop(nums, 0, 0, 0);
    }

    private static boolean splitOdd10Loop(int[] nums, int i, int sum1, int sum2) {
        if (i >= nums.length)
            return sum1 % 10 == 0 && sum2 % 2 == 1;

        return splitOdd10Loop(nums, i + 1, sum1, sum2 + nums[i]) ||
                splitOdd10Loop(nums, i + 1, sum1 + nums[i], sum2);
    }


    public static boolean split53(int[] nums) {
        return split53Loop(nums, 0, 0, 0);
    }

    private static boolean split53Loop(int[] nums, int i, int sum1, int sum2) {
        if (i >= nums.length)
            return sum1 == sum2;

        if (nums[i] % 5 == 0)
            return split53Loop(nums, i + 1, sum1 + nums[i], sum2);

        if (nums[i] % 3 == 0)
            return split53Loop(nums, i + 1, sum1, sum2 + nums[i]);

        return (split53Loop(nums, i + 1, sum1 + nums[i], sum2) ||
                split53Loop(nums, i + 1, sum1, sum2 + nums[i]));
    }
}