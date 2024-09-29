public class Array {
    public static void main(String[] args) {
        int ab[][] = {{100, 200}, {300, 400}, {500, 600}, {700, 800}, {900, 1000}};
//        for (int a = 0; a < ab.length; a++) {
//            for (int b = 0; b < ab[a].length; b++) {
//                System.out.println(ab[a][b]);
//            }
//        }

        for (int a[] : ab) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();

        }


        Object abc[][] = {{1, 2, 3}, {"Azima", "Armaan", "Anish"}};
        for (Object a : abc) {
            for (Object b : (Object[]) a) {
                System.out.print(b + " ");
            }

            System.out.println();
        }
    }
}

