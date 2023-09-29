//6. Write a Java program to create a new string repeating every character twice of a given
//        string.
//        Sample Output:
//        The given string is: welcome
//        The new string is: wweellccoommee
// DONE
import java.util.Scanner;
public class prog6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input an String: ");
        String st = scn.next();
        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i));
            System.out.print(st.charAt(i));
        }
    }

}
