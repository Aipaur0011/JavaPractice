package class11;
/*
1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade

 */

public class HW3 {
    public static void main(String[] args) {

        String [][] names={{"Tom", "Bob"},
                           { "Amy","Ali"}};

        char [][]grades={{'A','B'},
                           {'C','D'}};

        String[][] names1=new String[2][2];

        for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j < grades.length; j++) {


                System.out.println(names[i][j]);
            }
        }

        System.out.println();


    }
}
