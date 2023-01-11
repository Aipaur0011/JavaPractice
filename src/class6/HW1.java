package class6;
/*
Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
 */



public class HW1 {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;

        while (workDay){

            System.out.println("I need a day off");

            if(day>4){
                System.out.println("I do not need a day off any more");

                workDay=false;
            }
            day++;
        }

        /*boolean workDay=true;
        int day=1;

         while(day) {
             System.out.println("I need a day off");
         }
             day++;

             if (day == 1) {
                 System.out.println("I do not need a day off any more");
             }*/
    }
}
