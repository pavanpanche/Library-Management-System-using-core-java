package JavaDemo.LibraryManagementSystem;

public class Book {
        private String title;
        private String author;
        private String isbn;
        private boolean isIssued;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isIssued = false;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getIsbn() { return isbn; }
        public boolean isIssued() { return isIssued; }

        public void issueBook() { this.isIssued = true; }
        public void returnBook() { this.isIssued = false; }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Issued: " + isIssued;
        }

    }


