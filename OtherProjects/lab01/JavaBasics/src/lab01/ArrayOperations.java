package lab01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Create an array and take input from the user
        int[] array = new int[n];
        int sum = 0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];  // Calculate sum while reading input
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Calculate the average
        double average = (double) sum / n;
        
        // Print sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
        
        sc.close();
    }
}

