package Review4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //while loop
        int a=1;
        while(a<=3){
            System.out.println("I am while loop");
            a++;
        }
        //when we dont know how many times we need to repeat a block of code

        //while or do while

        int b=1;
        do{
            System.out.println("do while");
            b++;
        }while(b>=3);

        //Ask students if they understand loops?
        //if not tell them do practice more on loop
        //otherwise if they understand you good move to array concept

        Scanner sc=new Scanner(System.in);
        String answer;

        /*do {
            System.out.println("Do you understand LOOOPS in Java?");
            String answer = sc.nextLine();
        } while(!answer.equalsIgnoreCase("yes"));

        System.out.println("Got job! Lets learn Array now");*/





    }
}
