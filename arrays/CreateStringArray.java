public class CreateStringArray
{
    public static void main(String[] args) {
        String arr[];
        String[] arr1;  //Declaration of the String Array without specifying the size
        String[] arr2 = {"Lalit","Sachin","Aakash"};
        String arr22[] = {"I","love","you"};

        String arr61[];
        // arr61 = {"hi"}; // error

        String[] arr71; 
        // arr61 = {"hi"}; // error


        // String[2] arr33; // error
        // String arr44[2]; // error
        // String arr3[3] = {"You","are","Welcome"}; // error
        // String arr34[3] = {"You","are","Welcome"}; // error

        /////////////////////////////////////////////////////////////

        String[] arr4 = new String[3];
        String arr5[] = new String[3];

        // String[] arr66 = new String[]; // error
        // String arr77[] = new String[]; // error


        // String[] arr105 = new String[]; // error
        // arr105 = {"Good","job"};  // error


        //////////////////////////////////////////////////////////////

        // String[] arr55 = new String[2]{"No","problem"}; // error
        // String arr55[] = new String[2]{"No","problem"}; // error


        String[] arr21 = new String[2];
        // arr21 = {"No","Entry"};  // error
        //Initialization after declaration with specific size  
        arr21[0] = "no";
        arr21[1] = "entry";

        String arr31[] = new String[2];
        // arr21 = {"No","Entry"};  // error
        //Initialization after declaration with specific size  
        arr31[0] = "no";
        arr31[1] = "entry";

        ////////////////////////////////////////////////////////////////

        String[] arr88 = new String[]{"take","care","of","you"}; //inline initialization 
        String arr99[] = new String[]{"i","like","her"}; //inline initialization 

    }
}