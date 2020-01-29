import java.util.Arrays;
    // Java program to sort a numeric array and a String array.
public class numandStrarray {
        public static void main(String[] args){ // main method

            int[] my_array1 = { // array contains  numbers
                    2020, 2019, 2018, 2017, 2016,2015};

            String[] my_array2 = new String[]{ //array contains string
                    "London","Swizerland","Dubai","Paris","France","Canada"};
            System.out.println("Original numeric array : "+ Arrays.toString(my_array1));//method to call all number
            Arrays.sort(my_array1); //method to ascending numbers
            System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

            System.out.println("Original string array : "+Arrays.toString(my_array2));
            Arrays.sort(my_array2); //method to ascending string
            System.out.println("Sorted string array : "+Arrays.toString(my_array2));
        }
    }
