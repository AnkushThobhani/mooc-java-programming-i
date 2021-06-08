import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int small = array[0];
        for (int i=0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexFrom = startIndex;
        int smallest = table[startIndex];
        for (int i=startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexFrom = i;
            }
        }
        return indexFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swap1 = array[index2];
        int swap2 = array[index1];
        array[index1] = swap1;
        array[index2] = swap2;
    }
    
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }

}
