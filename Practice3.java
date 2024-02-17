package week4_day5;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Practice3 {
  public static void main(String[] args) {
    Calendar currentTime = Calendar.getInstance();

    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    String formattedTime = dateFormat.format(currentTime.getTime());

      System.out.println("Current time: " + formattedTime);
    }
}

