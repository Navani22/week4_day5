package week4_day5;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Book {
  ArrayList<Book> bookList = new ArrayList<Book>();
  String title;
  String author;
  String borrower = "None";
  String borrowedOn = "None";
}

class BookActions extends Book {
  public int displayMenu() {
    System.out.print("\n1. Add Book\n2. Show Books\n3. Issue Book\n4. Return Book\n5. Exit\n\nYour Choice: ");
    Scanner inputScanner = new Scanner(System.in);
    int selection = inputScanner.nextInt();
    return selection;
  }

  public void addBook() {
    boolean addMore = true;
    while (addMore) {
      Book newBook = new Book();
      LocalDateTime dateTime = LocalDateTime.now();
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a");
      String formattedDateTime = dateTime.format(dateTimeFormatter);
      System.out.print("\nEnter the book title: ");
      Scanner titleScanner = new Scanner(System.in);
      String bookTitle = titleScanner.nextLine();
      newBook.title = bookTitle;
      System.out.print("Enter the author's name: ");
      Scanner authorScanner = new Scanner(System.in);
      String authorName = authorScanner.nextLine();
      newBook.author = authorName;
      bookList.add(newBook);
      System.out.println("\n---You added " + bookTitle + " by " + authorName + " on " + formattedDateTime + "---");
      System.out.print("\nDo you want to add more books?\n1. Yes\n2. No\nYour choice: ");
      Scanner choiceScanner = new Scanner(System.in);
      int choice = choiceScanner.nextInt();
      addMore = (choice == 1);
    }
  }

  public void showBooks() {
    for (int i = 0; i < bookList.size(); i++) {
      System.out.println((i + 1) + ". " + bookList.get(i).title + " issued to " + bookList.get(i).borrower);
    }
  }

  public void issueBook() {
    showBooks();
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a");
    String formattedDateTime = dateTime.format(dateTimeFormatter);
    System.out.print("\nWhich book do you want to issue? Enter the book number: ");
    Scanner bookScanner = new Scanner(System.in);
    int bookChoice = bookScanner.nextInt() - 1;
    System.out.print("Enter your name: ");
    Scanner borrowerScanner = new Scanner(System.in);
    String borrowerName = borrowerScanner.nextLine();
    bookList.get(bookChoice).borrower = borrowerName;
    System.out.print("\n---" + bookList.get(bookChoice).title + " by " + bookList.get(bookChoice).author + " issued to "
        + bookList.get(bookChoice).borrower + " on " + formattedDateTime + "---\n");
  }

  public void returnBook() {
    System.out.print("\nEnter the book title: ");
    Scanner bookScanner = new Scanner(System.in);
    String titleToCheck = bookScanner.nextLine();
    String none = "None";
    int k = 0;
    for (int i = 0; i < bookList.size(); i++) {
      String compareTitle = bookList.get(i).title;
      if (titleToCheck.equals(compareTitle)) {
        bookList.get(k).borrower = none;
        showBooks();
      } else {
        k++;
        continue;
      }
    }
  }
}

public class Task1 {
  public static void main(String[] args) {
    System.out.println("Welcome to our Library!");
    BookActions actions = new BookActions();
    boolean moreActions = true;
    while (moreActions) {
      int userSelection = actions.displayMenu();
      switch (userSelection) {
        case 1:
          actions.addBook();
          break;
        case 2:
          actions.showBooks();
          break;
        case 3:
          actions.issueBook();
          break;
        case 4:
          actions.returnBook();
          break;
        case 5:
          moreActions = false;
          break;
      }
    }
  }
}

