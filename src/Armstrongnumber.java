import java.util.Scanner;
//Input any 3 digit number and check if it is Armstrong number or not
public class Armstrongnumber {

    public static void main(String[] args)//main method
    {
        int num, number, temp, total = 0;
        Scanner scanner = new Scanner(System.in);// calling scanner function
        System.out.println("Enter any 3 digit number: "); //
        num=scanner.nextInt();
        scanner.close();
        number = num;

        // Function to check whether the given number is
        // Armstrong number or not

        for (; number!=0; number/=10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        if (total == num)
        {
            System.out.println(num + " : is an Armstrong Number");
        }
        else
        {
            System.out.println(num + " : is not an Armstrong number");
        }
    }
}

