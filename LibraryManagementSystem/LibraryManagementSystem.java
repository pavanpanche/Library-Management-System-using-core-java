package JavaDemo.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter ISBN of book to issue: ");
                    isbn = scanner.nextLine();
                    Book bookToIssue = library.findBookByIsbn(isbn);
                    if (bookToIssue != null && !bookToIssue.isIssued()) {
                        bookToIssue.issueBook();
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("Book not found or already issued.");
                    }
                    break;
                case 4:
                    System.out.print("Enter ISBN of book to return: ");
                    isbn = scanner.nextLine();
                    Book bookToReturn = library.findBookByIsbn(isbn);
                    if (bookToReturn != null && bookToReturn.isIssued()) {
                        bookToReturn.returnBook();
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book not found or not issued.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
                    System.out.println("Choose Right Option");
            }
        }
    }
}
