import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

     
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        
        Arrays.sort(numbers);

        
        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
