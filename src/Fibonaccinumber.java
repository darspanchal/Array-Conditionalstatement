import java.util.Scanner;
    // Fibonacci number
public class Fibonaccinumber {

    public static void main(String[] args) // main method
    {

        int n, first = 0,next = 1;

        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        int i = 1;
        while (i<n-1)   ////New number should be the sum of the last two numbers of the serie
        {
            int sum = first + next;
            //On each iteration, we are assigning second number
            // to the first number and assigning the sum of last two
            // numbers to the second number

            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }

    }

}
