package week4_day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Practice4 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = currentTime.format(formatter);

        System.out.println("Current time: " + formattedTime);
    }
}
