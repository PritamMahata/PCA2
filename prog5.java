//5. Write a Java program that reads an positive integer and count the number of digits the
//        number (less than ten billion) has.
//        Test Data
//        Input an integer number less than ten billion: 125463
//        Expected Output :
//        Number of digits in the number: 6
// DONE

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion:");
//        int num = scn.nextInt();
//        String value = String.valueOf(num);
//        System.out.println("Number of digits in the number: " + value.length());
        int num = scn.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
