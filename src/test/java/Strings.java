import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        Strings strings = new Strings();
        String a = "  Welcome to programming!  ";
        String abc = "Azima@gmail.com";
        String numbers = "$123, 124, 543";
        String welcome = "Welcome";
        String p = "madam";
        String special = "#yel&low@$ is cool!&(^%*)";
        numbers = numbers.replace("$", "");
        System.out.println(strings.trimString(a));
        String[] number = (numbers.split(","));
        System.out.println(numbers);
        System.out.println(number[0]);
        System.out.println(strings.containsWord(a, "Dallas"));
        System.out.println(strings.replaceValue(a, "Dallas", "America"));
        System.out.println(strings.extractSubString(a, 2));
        System.out.println(Arrays.toString(strings.splitString(abc, "@")));
        System.out.println(strings.reverseString(welcome));
        System.out.println(strings.reverseStringUsingStringBuilder(welcome));
        System.out.println(strings.isStringPalindrome(p));
        System.out.println(strings.removeSpecialCharacters(special));
        System.out.println(strings.removeWhiteSpaces(a));
        System.out.println(strings.countOccurencesOfCharacter(a, 'w'));
        System.out.println(strings.countWordsInString(a));
    }

    public String trimString(String a) {
        return a.trim();
    }

    public boolean containsWord(String a, String elementToCheck) {

        return a.contains(elementToCheck);

    }

    public String replaceValue(String a, String oldString, String newString) {
        return a.replaceAll(oldString, newString);
    }

    public String extractSubString(String a, int starting) {
        if (starting < 0 || starting >= a.length()) {
            return "";
        }
        return a.substring(starting).toLowerCase();

    }

    public String[] splitString(String a, String extractBy) {
        return a.split(extractBy);

    }

    public String reverseString(String reverse) {
        char[] a = reverse.toCharArray();
        String rev = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            rev += a[i];
        }
        return rev;
    }

    public String reverseStringUsingStringBuilder(String reverse) {
        return new StringBuilder(reverse).reverse().toString();
    }

    public boolean isStringPalindrome(String a) {
        String reversed = reverseString(a);
        return reversed.equalsIgnoreCase(a);

    }

    public String removeSpecialCharacters(String a) {
        return a.replaceAll("[^a-zA-Z0-9]", "");
    }

    public String removeWhiteSpaces(String a) {
        return a.replaceAll("\\s", "");
    }

    public int countOccurencesOfCharacter(String a, char character) {
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

    public int countWordsInString(String a) {
        return a.trim().split("\\s+").length;

    }

}
