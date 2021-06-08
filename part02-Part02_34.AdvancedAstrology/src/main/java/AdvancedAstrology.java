
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int start = 1;
        while (start <= number) {
            System.out.print("*");
            start ++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int start = 1;
        while (start <= number) {
            System.out.print(" ");
            start ++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int start = 1;
        while (start <= size) {
            printSpaces(size - start);
            printStars(start);
            start ++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int start = 1;
        while (start <= height) {
            printSpaces(height - start);
            printStars(start + start - 1);
            start ++;
        }
        int baseStart = 1;
        while (baseStart <= 2) {
            printSpaces(height - 2);
            printStars(3);
            baseStart ++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
