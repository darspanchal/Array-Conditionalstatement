import java.util.Scanner;

public class arraywithspevalue {

    // Java program to test if an array contains a specific value.

    public static void main(String[] args) // main method
    {

        int[] arraynumbers = {1,2,3,4,5}; // Get the array

        Scanner sc = new Scanner(System.in); //calling scanner method

        System.out.println("Enter a value"); //print method
        int num = sc.nextInt();

        for (int x = 0; x < arraynumbers.length; x++) // Get the value to be checked
        {
            if (arraynumbers[x] == num) // Check if this value is
            // present in the array or not
            {
                System.out.println("Value exists in array!"); // Print the array
            }else{
                System.out.println("Value doesn't exists in array!");
            }
        }

    }



}
