

//2. Write a Java program to capitalize the first letter of each word in a sentence.
//   Sample Output:
//   Input a Sentence: the quick brown fox jumps over the lazy dog.
//   The Quick Brown Fox Jumps Over The Lazy Dog.
//   DONE

import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String temp;
        System.out.println("Input an String: ");
        String st = scn.nextLine();
        for (int i = 0; i < st.length(); i++) {
            if (i == 0) {
                temp = String.valueOf(st.charAt(i));
                System.out.print(temp.toUpperCase());
            } else if (st.charAt(i) == ' ' && st.charAt(i + 1) != ' ' && st.charAt(i - 1) != ' ') {
                temp = String.valueOf(st.charAt(i + 1));
                System.out.print(' ' + temp.toUpperCase());
            } else if (st.charAt(i - 1) != ' ' || st.charAt(i + 1) == ' ' && st.charAt(i + 1) != ' ') {
                System.out.print(st.charAt(i));
            }
        }
    }
}
