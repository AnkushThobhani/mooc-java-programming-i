

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);
    }
    
    public static void printUntilNumber(int number) {
        int num = 1;
        while (num <= number) {
            System.out.println(num);
            
            num += 1;
        }
    }

}
