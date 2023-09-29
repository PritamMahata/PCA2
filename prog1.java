// 1. Write a Java program to convert seconds to hour, minute and seconds.
//    Sample Output:
//    Input seconds: 86399
//    23:59:59
//    DONE
public class prog1 {
    public static void main(String[] args) {
        int hh, mm, ss, time = 86399;
        hh = time / 3600;
        mm = (time - hh * 3600) / 60;
        ss = time - hh * 3600 - mm * 60;
        System.out.printf("%d:%d:%d", hh, mm, ss);
    }
}