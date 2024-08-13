package com.org.aac;

class Book{
	private String title;
	private String author;
	private String isbn;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
}

class Library{
	private Book[] books;
	private int bookCount;
	
	public Library (int capacity) {
		books = new Book[capacity];
		bookCount =0;
	}
	
	public boolean addbook(Book book) {
		if(bookCount < books.length) {
		books[bookCount++] = book;
		return true;
	}else {
		System.out.println("Library is full. Cannot add more books.");
		return false;
	}
}
	public void displayLibraryBooks() {
		System.out.println("Library Books:");
		for(int i=0; i< bookCount;i++) {
			System.out.println("Book "+ (i + 1)+ ":"+books[i].toString());
		}
	}
	
}
public class CompositionExample {
   public static void main(String[] args) {
	   Library myLibrary = new Library(3);
	   
	  Book book1 = new Book("The catcher","J&D","897845-7852");
	  Book  book2 = new Book("The bucher","J&A","897845-7845");
	   Book book3= new Book("The hatcher","J&B","897845-4562");
	  myLibrary.addbook(book1);
	  myLibrary.addbook(book3);
	  myLibrary.addbook(book2);
	  myLibrary.displayLibraryBooks();
   }
}
