package week4_day5;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Practice2 {
    public static void main(String[] args) {
        Date currentTime = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        String formattedTime = dateFormat.format(currentTime);

        System.out.println("Current time: " + formattedTime);
    }
}