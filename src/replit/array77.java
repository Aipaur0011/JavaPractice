package replit;
/*
**For you to do:**

Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.

**Example:**

```
Input:
* 1
* 2
* 3
* 4
* 5
Output:
5
* 4
* 3
* 2
* 1
*

 */

import java.util.Scanner;

public class array77 {
    public static void main(String[] args) {

        int []num=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        for(int i=0; i<num.length; i++){

            for(int j=0;j<i;j--){

            }
            System.out.println(num[i]);
        }
        System.out.println();

    }
}
