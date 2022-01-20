import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Day1 {
    
    // one pass ver 1
    public static boolean containsPairWithSum(int[] a, int x) {
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

    2 loop
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

        for (int i = 0; i < number; i++) {
            myArr[i] = input.nextInt();
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