import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / length;
        sc.close();
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
    }        
}
