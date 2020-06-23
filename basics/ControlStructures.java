package basics;

import java.util.ArrayList;

/*
Three kinds of Control Structures:
1. Conditional : if/else/else if , ternary operator and switch
2. Loops: for while and do while
3. Branching Statements: Change flow of the loop. Break and continue
 */
public class ControlStructures {

    //Used for removing many nested if else constructs
    public void SwitchDem (){
        int luckValue = (int) (Math.random() * 3);
        switch (luckValue) {
            case 0:
                System.out.println("Spirits are not happy with you today");
                break;
            case 1:
                System.out.println("Spirits are fine.");
                break;
            case 2:
                System.out.println("Spirits are happy with you");
                break;
            default:
                System.out.println("No idea how we reach here but do this if you do");
                break;
        }
    }

    //Sometimes avoiding block purpose fully.
    public String SwitchDem2(String animal) {
        String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }

    //Simple if else
    public void IfElseDem(){
        if(Math.random() > 0.5){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
    /*
    3 ARGUMENTS
    1 -> Boolean condition to be evaluated
    2 -> If the 1st arg evaluates to true. Do the 2nd thing
    3 -> Else do this thing
     */

    public void TernaryDem(){
        double tossValue = Math.random();
        System.out.println(tossValue > 0.5 ?
                "Greater than 0.5 --> Heads" :
                "Less than 0.5 --> Tails");
    }

    //For loop and while loop
    public void LoopDem(){

        int[] nums = new int[3];

        //Basic for loop
        for(int i=0; i < nums.length;i++) nums[i] = i;

        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhinav");
        names.add("Apurva");
        names.add("Daman");

        //for each element do this
        //ALso note the use of continue
        for(String name: names){
            //Skip the rest of the loop iteration. If you want to exit loop use break
            if(name.equals("Abhinav")){
                System.out.println("Abhinav is the owner of this repo");
                continue;
            }
            System.out.println(name + " is awesome!");

        }

        int whileCount = 3;
        //While use
        while(whileCount >= 0){
            System.out.print(whileCount);
            whileCount--;
            //Exit the loop when expression is true.
            //If you're looking for a value. When you find the value you should break the loop
            if(whileCount == 1) break;
        }
    }

    /*
    The do-while loop works just like the while loop
    except for the fact that the first condition evaluation happens
    after the first iteration of the loop:
     */
    public void DoWhileDem(){

        int i = 0;
        do {
            System.out.println("Do-While loop: i = " + i++);
        } while (i < 5);

    }
    public static void main(String[] args){
        ControlStructures cs = new ControlStructures();
        cs.IfElseDem();
        cs.SwitchDem();
        cs.SwitchDem2("CAT");
        cs.TernaryDem();
        cs.LoopDem();
        cs.DoWhileDem();
    }
}
