

//8. Write a Java method to count all words in a string.
//        Test Data:
//        Input the string: The quick brown fox jumps over the lazy dog.
//        Expected Output:
//        Number of words in the string: 9
// DONE

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input an String: ");
        String st = scn.nextLine();
        int count = 1;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ' && st.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + count);
    }
}
