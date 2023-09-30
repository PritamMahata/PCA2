//3. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd
// DONE
import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // with using method
        System.out.println("Input a word: ");
        StringBuffer st1 = new StringBuffer(scn.next());
        st1.reverse();
        System.out.println("Reverse word: " + st1);

        //with logic
        System.out.println("Input a word: ");
        String st2 = scn.nextLine();
        String rev = "", ch;
        for (int i = 0; i < st2.length(); i++) {
            ch = String.valueOf(st2.charAt(i));
            rev = ch + rev;
        }
        System.out.println("Reverse word: " + rev);
    }
}