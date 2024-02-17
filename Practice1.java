package week4_day5;

import java.util.ArrayList;

public class Practice1 {
  public static void main(String[] args) {

    ArrayList list = new ArrayList();
    list.add("Aman");
    list.add("Akash");
    list.add("Kaveri");
    list.add("khushi");
    list.add("Manav");
    list.add("Nisha");
    list.add("Palak");
    list.add("Ram");
    list.add("Riddhi");
    list.add("Stuti");
    for (Object o : list) {
      System.out.println(o);
    }
  }

}