import java.util.Scanner;

public class DisplayReverseArray
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the elements: ");
        inputArr(arr);
        System.out.println("Reversed array is: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
    public static void inputArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
    }
}