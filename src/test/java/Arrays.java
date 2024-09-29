import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 55, 61, 20, 25, 100};
        int[] range = {1, 2, 3, 4, 6};
        String[] duplicates = {"C++", "C", "C++", "Java", "Selenium", "Java"};
        System.out.println(searchElementInArray(35, a));
        System.out.println(sortingAnArray(a));
        System.out.println(sortingStringAfterGettingInputFromUser());
        System.out.println(printInReverseOrder(a));
        System.out.println(numbersInRange(range));
        System.out.println(removeDuplicatesFromArray(duplicates));
    }

    public static boolean searchElementInArray(int searchElement, int[] a) {

        boolean element_found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) {
                element_found = true;
                break;
            }
        }
        return element_found;
    }

    public static String sortingAnArray(int[] array) {
        java.util.Arrays.sort(array);
        return java.util.Arrays.toString(array);
    }

    public static String sortingStringAfterGettingInputFromUser() {
        String[] strings = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Please enter string");
            strings[i] = scanner.next();
        }
        java.util.Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        scanner.close();
        return java.util.Arrays.toString(strings);

    }

    public static ArrayList<Integer> printInReverseOrder(int[] abc) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = abc.length - 1; i >= 0; i--) {
            arrayList.add(abc[i]);
        }

        return arrayList;
    }

    public static int numbersInRange(int[] range) {

        int n = range.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int a : range) {
            actualSum += a;
        }

        return expectedSum - actualSum;
    }

    public static HashSet<String> removeDuplicatesFromArray(String[] duplicateArray) {
        HashSet<String> set = new HashSet<>();


        for (String value : duplicateArray) {
            if (!set.add(value)) {
                System.out.println("Duplicate Value: " + value);
            }
        }

        System.out.println("New array without duplicates " );
        return set;
    }

}
