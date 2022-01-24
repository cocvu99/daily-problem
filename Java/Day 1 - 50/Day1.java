/**
 * Given a list of numbers and a number k, 
 * return whether any two numbers from the list add up to k
 *
 * For example, given [10, 15, 3, 7] and k of 17, 
 * return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Day1 {
    
    // one pass ver 1
    public static boolean containsPairWithSum(int[] a, int x) {
        /**
         * using: import Arrays library
         */
        Arrays.sort(a);
        for (int i = 0, j = a.length - 1; i < j;) {
            int sum = a[i] + a[j];
            if (sum < x)
                i++;
            else if (sum > x)
                j--;
            else
                return true;
        }
        return false;
    }

    //2 loop
    public static boolean FindPairs(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Do dai mang?: ");
        int number = input.nextInt();

        System.out.print("Number k: ");
        int k = input.nextInt();

        int[] myArr = new int[number];
        HashSet<Integer> myHashSet = new HashSet<Integer>();

        for (int i = 0; i < number; i++) {
            myArr[i] = input.nextInt();
        }

        // nhap cac phan tu cua mang ve HashSet
        for (int i = 0; i < myArr.length; i++) {
            myHashSet.add(myArr[i]);
        }

        // using HashSet: contains function
        boolean flag = false;
        for (int i = 0; i < myArr.length; i++) {
            if (myHashSet.contains(k - myArr[i])) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Check HashSet OK TMDK");
        } else {
            System.out.println("Mang HashSet KHONG OK");
        }


        // one pass ver 1
        if (containsPairWithSum(myArr, k)) {
            System.out.println("Mang OK");
        } else {
            System.out.println("Mang KHONG TMDK");
        }

        // if (!FindPairs(myArr, k)) {
        //     System.out.println("Mang? Thoa man DK");
        // } else {
        //     System.out.println("Mang? KHONG TMDK");
        // }
        
    }

}