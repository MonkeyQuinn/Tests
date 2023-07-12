import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map2 {
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> dict = new HashMap<>();
        for (String s : strings) dict.put(s, 0);
        return dict;
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> dict = new HashMap<>();
        for (String s : strings) dict.put(s, s.length());
        return dict;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> dict = new HashMap<>();
        for (String s : strings) dict.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        return dict;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> dict = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            int j = i;
            int val = (int) Arrays.stream(strings).filter(x -> Objects.equals(x, strings[j])).count();
            dict.put(key, val);
        }

        return dict;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> dict = new HashMap<>();

        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            String val = Arrays.stream(strings).filter(x -> String.valueOf(x.charAt(0)).equals(key)).reduce((c1, c2) -> c1 + c2).orElse("");
            dict.put(key, val);
        }

        return dict;
    }

    public static String wordAppend(String[] strings) {
        String str = "";
        Map<String, Integer> dict = new HashMap<>();
        for (String s : strings) dict.put(s, 0);
        for (String s : strings) {
            dict.put(s, dict.get(s) + 1);
            if (dict.get(s) % 2 == 0) str += s;
        }
        return str;
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> dict = new HashMap<>();
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            dict.put(s, 0);
            map.put(s, false);
        }

        for (String s : strings) {
            dict.put(s, dict.get(s) + 1);
            if (dict.get(s) >= 2) map.put(s, true);
            else map.put(s, false);
        }
        return map;
    }

    public static String[] allSwap(String[] strings) {
        Map<Integer, String> dict = new HashMap<>();
        for (int i = 0; i < strings.length; i++) dict.put(i, strings[i]);

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (!dict.get(i).isEmpty() && !dict.get(j).isEmpty() && dict.get(i).charAt(0) == dict.get(j).charAt(0)) {
                    strings[i] = dict.get(j);
                    strings[j] = dict.get(i);

                    dict.put(j, "");
                    dict.put(i, "");
                    break;
                }
            }
        }

        return strings;
    }

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> dict = new HashMap<>();
        for (String s : strings) if (!s.isEmpty()) dict.put(String.valueOf(s.charAt(0)), 0);

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];

            if (!s.isEmpty() && dict.containsKey(String.valueOf(s.charAt(0)))) {
                char c = s.charAt(0);

                for (int j = i + 1; j < strings.length; j++) {
                    s = strings[j];

                    if (!s.isEmpty() && s.charAt(0) == c) {
                        String val = strings[i];
                        strings[i] = s;
                        strings[j] = val;
                        dict.remove(String.valueOf(c));
                        break;
                    }
                }
            }
        }
        return strings;
    }
}
