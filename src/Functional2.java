import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(i -> i >= 0).collect(Collectors.toList());
    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(i -> i % 10 != 9).collect(Collectors.toList());
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(i -> i < 13 || i > 19).collect(Collectors.toList());
    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }

    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() != 4 && s.length() != 3).collect(Collectors.toList());
    }

    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s.contains("yy") ? s : s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(i -> i * 2).filter(i -> i % 10 != 2).collect(Collectors.toList());
    }

    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(i -> i * i + 10).filter(i -> i % 10 != 5 && i % 10 != 6).collect(Collectors.toList());
    }
}
