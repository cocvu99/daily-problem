/**
 * This problem was asked by Uber.
 * Given an array of integers, return a new array such 
 * that each element at index i of the new array is the
 * product of all the numbers in the original array except
 * the one at i.
 * 
 * 
For example, if our input was [1, 2, 3, 4, 5], the 
expected output would be [120, 60, 40, 30, 24]. If 
our input was [3, 2, 1], the expected output would 
be [2, 3, 6].

Follow-up: what if you can't use division?
 */
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do dai mang?: ");
        int number = input.nextInt();

        int[] myArr = new int[number];
        for (int i = 0; i < number; i++) {
            myArr[i] = input.nextInt();
        }
    
        System.out.println("Method 1:");
        ArrayProduct1(myArr, number);

        System.out.println("Method 2:");
        ArrayProduct2(myArr, number);

    }

    // Method 1: use 'common multiple', division
    static void ArrayProduct1(int arr[], int n) {
        int bc = 1;
        int[] new_array = new int[n];
        for (int i = 0; i < n; i++) {
            bc = bc * arr[i];
        }

        for (int i = 0; i < n; i++) {
            new_array[i] = bc / arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(new_array[i] + " ");
        }
    }

    // Method 2:
    static void ArrayProduct2(int arr[], int n){

    }
}
