import java.util.Scanner;

// Calculate the length of an array

public class CalculateLength
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the elements: ");
        inputArr(arr);
        System.out.println("Length of the array is : "+arrayLength(arr));
    }
    public static void inputArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
    }
    public static int arrayLength(int[] arr)
    {
        int size=0;
        for(int i=0;i<arr.length;i++)
        {
            size++;
        }
        return size;
    }
}