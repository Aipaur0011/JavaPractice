package class12;
/*
2) Create a String and print it in reverse order (Sunday → yadnuS).
 */

public class HW2 {
    public static void main(String[] args) {

        String word="Sunday";
        String reverse="";

        for (int i = 0; i <word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }

        System.out.println("Reversed string: "+reverse);






    }
}
