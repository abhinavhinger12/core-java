package basics;

import java.util.ArrayList;


public class BasicSyntax {

    public static void main(String[] args){

        //Difference in type of quotes in char and String declaration
        String name = "Abhinav Hinger";
        char flag = 'Y';
        boolean isCorrect = true;

        //Array declaration --> type[] identifier = new type[length];
        int[] nums = new int[10];

        //arrays have length field but not else more is there
        int arraySize = nums.length;

        /*
        Arithmetic Operators are + - * / %
        Logical Operators are && (AND) || (OR) ! (Not)
        Comparison Operators  < <= >= > == !=
         */

        int a = 5;
        if(a%2 == 0 || a%3==0){
            System.out.println("Divisible by 2 or 3");
        }
        else {
            System.out.println("Not divisible by 2 and 3");
        }

    }
}
