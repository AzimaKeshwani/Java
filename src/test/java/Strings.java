import java.util.Arrays;

public class Strings {

    private String a;

    Strings(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Strings strings = new Strings("  Welcome to programming!  ");
        Strings strings1 = new Strings("Azima@gmail.com");
        Strings strings2 = new Strings("madam");
        Strings strings3 = new Strings("###Wel$$!come 786$");
        String numbers = "$123, 124, 543";
        numbers = numbers.replace("$", "");
        System.out.println(strings.trimString());
        String[] number = (numbers.split(","));
        System.out.println(numbers);
        System.out.println(number[0]);
        System.out.println(strings.containsWord("programming"));
        System.out.println(strings.replaceValue("programming", "America"));
        System.out.println(strings.extractSubString(13));
        System.out.println(Arrays.toString(strings1.splitString("@")));
        System.out.println(strings.reverseString());
        System.out.println(strings.reverseStringUsingStringBuilder());
        System.out.println(strings2.isStringPalindrome());
        System.out.println(strings3.removeSpecialCharacters());
        System.out.println(strings.removeWhiteSpaces());
        System.out.println(strings.countOccurencesOfCharacter('w'));
        System.out.println(strings.countWordsInString());
    }

    public String trimString() {
        return a.trim();
    }

    public boolean containsWord(String elementToCheck) {

        return a.contains(elementToCheck);

    }

    public String replaceValue(String oldString, String newString) {
        return a.replaceAll(oldString, newString);
    }

    public String extractSubString(int starting) {
        if (starting < 0 || starting >= a.length()) {
            return "";
        }
        return a.substring(starting).toLowerCase();

    }

    public String[] splitString(String splitAt) {
        if (a == null || a.isEmpty()) {
            return new String[]{""};
        }

        if (splitAt == null || splitAt.isEmpty()) {
            return new String[]{a};
        }
        return a.split(splitAt);

    }

    public String reverseString() {
        char[] b = a.toCharArray();
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev += b[i];
        }
        return rev;
    }

    public String reverseStringUsingStringBuilder() {
        return new StringBuilder(a).reverse().toString();
    }

    public boolean isStringPalindrome() {
        String reversed = reverseString();
        return reversed.equalsIgnoreCase(a);

    }

    public String removeSpecialCharacters() {
        return a.replaceAll("[^a-zA-Z0-9]", "");
    }

    public String removeWhiteSpaces() {
        return a.replaceAll("\\s", "");
    }

    public int countOccurencesOfCharacter(char character) {
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

    public int countWordsInString() {
        return a.trim().split("\\s+").length;

    }

}
