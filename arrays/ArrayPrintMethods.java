import java.util.Scanner;
import java.util.Arrays;
public class ArrayPrintMethods
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Displaying the array elements ");
        forEach(arr);
//        forLoop(arr);
        arrayClass(arr);   // print using array class
        input.close();
    }
    public static void forEach(int arr[])
    {
        for(int a : arr)
         {
             System.out.println(a);
         }
    }
    public static void forLoop(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void arrayClass(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}

}