import java.util.Scanner;

// Find the frequency of a specified element in an array
public class ElementFrequency
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,2,3,16,9,15,1,8,1,3,4,9,10,3,17,15,3};
        System.out.print("Enter the element whose occurance you want to find: ");
        int num = input.nextInt();
        System.out.println("Frequency of "+num+" is: "+frequency(arr,num));
    }
    public static int frequency(int[] arr, int num)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                count++;
            }
        }
        return count;
    }
}