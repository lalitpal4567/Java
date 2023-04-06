public class MergeTwoSortedArray
{
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,5,7,9,11};
        int[] arr2 = new  int[]{1,3,6,8,10};
        int size1 = arr1.length;
        int size2 = arr2.length;

        int[] arr3 = new int[size1+size2];
        merge(arr1,arr2,arr3,size1,size2);
    }
    public static void merge(int[] arr1, int[] arr2, int[] arr3, int size1,int size2)
    {
        if(size1==size2)
        {
            int j=0;
            for(int i=0;i<size1;i++)
            {
                if(arr1[i]<arr2[i])
                {
                    arr3[j++] = arr1[i];
                }
            }
        }
    }
}