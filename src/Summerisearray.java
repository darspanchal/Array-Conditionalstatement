import java.util.Scanner;
    //program to sum values of an array.
public class Summerisearray {

        public static void main(String args[]){ //main method
            Scanner scanner = new Scanner(System.in);//scanner class
            int[] array = new int[5]; //integer value assign in array
            int sum = 0;
            System.out.println("Enter the elements:");
            for (int i=0; i<5; i++) //for loop condition
            {
                array[i] = scanner.nextInt(); //array using scanner
            }
            for( int num : array) { //array element for sum value
                sum = sum+num;
            }
            System.out.println("Sum of array elements is:"+sum); //print method fo sum value
        }

}
