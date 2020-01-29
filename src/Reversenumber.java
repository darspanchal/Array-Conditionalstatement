import java.util.Scanner;
// input any number and then reverse the number

public class Reversenumber {

    public static void main(String args[]) //main method
    {
        int n, reverse = 0;

        System.out.println("Enter an integer to reverse number");
        Scanner in = new Scanner(System.in); ////This statement will capture the user input
        n = in.nextInt(); ////Captured input would be stored in number num

        while(n != 0) //method for reverse value
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
}
