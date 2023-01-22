/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_interview1;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(display(9));
    }

    public static String display(int num) {
        int time = (num < 13) ? num : num - 12;
        String stringifiedTime = (num < 12) ? time + ":00 AM" : time + ":00 PM";
        String readableTime = (time < 9) ? "0"+stringifiedTime : stringifiedTime;
        return readableTime;
    }
}
