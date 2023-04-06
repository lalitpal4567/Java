import java.util.Scanner;

// Sum of all elements in an array

public class SumOfElements
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the elements: ");
        inputArr(arr);
        System.out.println("Sum of all elements are: "+sumArray(arr));
    }

    public static void inputArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
    }
    public static int sumArray(int[] arr)
    {
        int sum=0;
        for(int num: arr)
        {
            sum+=num;
        }
        return sum;
    }
}