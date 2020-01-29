import java.util.Scanner;
    //multiplication table
public class multiplicationtable {

    public static void main(String[] args) {//main method
        Scanner in = new Scanner(System.in); // This reads the input provided by user using keyboard

        System.out.print("Input a number: "); //print command
        int num1 = in.nextInt(); // // This method reads the number provided using keyboard

        for (int i=0; i< 9; i++){ //// Change here to change output
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
    }
}
