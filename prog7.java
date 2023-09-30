

//7. Write a Java program to count the number of words ending in &#39;m&#39; or &#39;n&#39; (not case sensitive)
//        in a given text.
//        Sample Output:
//        The given string is: mam is in the room
//        The number of words ends with m or n is: 3
// DONE

import java.util.Scanner;
public class prog7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        int count = 1;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                if (st.charAt(i - 1) == 'n' || st.charAt(i - 1) == 'm') {
                    count++;
                }
            }
        }
        System.out.println("Number of words in the string: " + count);

    }
}
