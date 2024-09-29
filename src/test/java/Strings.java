import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "  Welcome to programming!  ";
        String abc = "Azima@gmail.com";
        String numbers = "$123, 124, 543";
        String welcome = "Welcome";
        String p = "madam";
        String special = "#yel&low@$ is cool!&(^%*)";
        numbers = numbers.replace("$", "");
        String[] number = (numbers.split(","));
        System.out.println(numbers);
        System.out.println(number[0]);
        System.out.println(trimString(a));
        System.out.println(containsWord(a, "Dallas"));
        System.out.println(replaceValue(a, "Dallas", "America"));
        System.out.println(extractSubString(a, 2));
        System.out.println(Arrays.toString(splitString(abc, "@")));
        System.out.println(reverseString(welcome));
        System.out.println(reverseStringUsingStringBuilder(welcome));
        System.out.println(isStringPalindrome(p));
        System.out.println(removeSpecialCharacters(special));
        System.out.println(removeWhiteSpaces(a));
        System.out.println(countOccurencesOfCharacter(a, 'w'));
        System.out.println(countWordsInString(a));
    }

    public static String trimString(String a) {
        return a.trim();
    }

    public static boolean containsWord(String a, String elementToCheck) {

        return a.contains(elementToCheck);

    }

    public static String replaceValue(String a, String oldString, String newString) {
        return a.replaceAll(oldString, newString);
    }

    public static String extractSubString(String a, int starting) {
        if (starting < 0 || starting >= a.length()) {
            return "";
        }
        a = a.substring(starting).toLowerCase();
        return a;
    }

    public static String[] splitString(String a, String extractBy) {
        return a.split(extractBy);

    }

    public static String reverseString(String reverse) {
        char[] a = reverse.toCharArray();
        String rev = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            rev += a[i];
        }
        return rev;
    }

    public static String reverseStringUsingStringBuilder(String reverse) {
        return new StringBuilder(reverse).reverse().toString();
    }

    public static boolean isStringPalindrome(String a) {
        String reversed = reverseString(a);
        return reversed.equalsIgnoreCase(a);

    }

    public static String removeSpecialCharacters(String a) {
        return a.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String removeWhiteSpaces(String a) {
        return a.replaceAll("\\s", "");
    }

    public static int countOccurencesOfCharacter(String a, char character) {
        int count = 0;
        String toLowerCase = a.toLowerCase();
        char[] abc = toLowerCase.toCharArray();
        for (char counting : abc) {
            if (counting == character) {
                count++;
            }
        }
        return count;
    }

    public static int countWordsInString(String a) {
        return a.trim().split("\\s+").length;

    }

}
