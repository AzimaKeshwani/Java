import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "  Welcome to Dallas!  ";
        String abc = "Azima@gmail.com";
        String numbers = "$123, 124, 543";
        String welcome = "Welcome";
        String p = "madam";
        String special = "#yel&low@$ is cool!&(^%*)";
        numbers = numbers.replace("$", "");
        String[] number = (numbers.split(","));
        System.out.println(numbers);
        System.out.println(number[0]);
        System.out.println(removeSpacesFromString(a));
        System.out.println(containsWord(a, "Dallas"));
        System.out.println(replaceValue(a, "Dallas", "America"));
        System.out.println(extractSubString(a));
        System.out.println(Arrays.toString(splitString(abc, "@")));
        System.out.println(reverseString(welcome));
        System.out.println(reverseStringUsingStringBuilder(welcome));
        System.out.println(isStringPalindrome(p, p));
        System.out.println(removeSpecialCharacters(special));
        System.out.println(removeWhiteSpaces(a));
        System.out.println(countOccurencesOfCharacter(a, 'w'));
    }

    public static String removeSpacesFromString(String a) {
        a = a.trim();
        return a;
    }

    public static boolean containsWord(String a, String elementToCheck) {
        boolean containsValue = false;
        containsValue = a.contains(elementToCheck);

        return containsValue;
    }

    public static String replaceValue(String a, String oldString, String newString) {
        a = a.replaceAll(oldString, newString);
        return a;
    }

    public static String extractSubString(String a) {
        a = a.substring(2, a.length() - 1).toLowerCase();
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

    public static StringBuilder reverseStringUsingStringBuilder(String reverse) {
        StringBuilder stringBuilder = new StringBuilder(reverse);
        stringBuilder.reverse();
        return stringBuilder;
    }

    public static boolean isStringPalindrome(String a, String b) {
        reverseString(a);
        return a.equalsIgnoreCase(b);

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

}
