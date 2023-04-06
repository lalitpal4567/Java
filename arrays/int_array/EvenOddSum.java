import java.util.Scanner;

// sum of even and odd numbers in an array

public class EvenOddSum
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the elements: ");
        inputArr(arr);
        sumEvenOdd(arr);
    }
    public static void inputArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
    }
    public static void sumEvenOdd(int[] arr)
    {
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenSum+= arr[i];
            }
            else
            {
                oddSum+= arr[i];
            }
        }
        System.out.println("Even sum is: "+evenSum);
        System.out.println("Odd sum is: "+oddSum);
    }
}