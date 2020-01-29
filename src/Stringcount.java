import java.util.Scanner;
        // enter any String and count total number of "a" in that String.
public class Stringcount {
        public static void main(String[] args) //main method
        {
            String str = " ";
            int count =0;
            Scanner scanner=new Scanner(System.in);
            System.out.print( "Enter any sentence :-"); //print method
            str=scanner.nextLine(); //string character count
            for (int i = 0; i <str.length() ; ++i) // method to find specific string
            {
                switch (str.charAt(i))
                {
                    case 'a':
                    case 'A':
                        count++;
                }
            }
            System.out.println( "The total number of a in the string are :"+ count);
        }
    }

