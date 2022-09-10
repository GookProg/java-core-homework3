package homework;

/**
 * Task3
 * Реализовать функцию нечеткого поиска
 */

public class Task3 {
    public static boolean fuzzySearch(String pattern, String target) {
        if (pattern == null || target == null) {
            System.out.println("String must not be null!");
            return false;
        }

        for (int i = 0, j = 0; i < target.length(); i++) {
            if (target.charAt(i) == pattern.charAt(j))
                j++;

            if (j == pattern.length())
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch(null, "oaipjcaoisjdwklhcvbf")); // false
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
        System.out.println(fuzzySearch("cwhf", "oaipjcaoisjdwklhcvbf")); // true
    }
}
