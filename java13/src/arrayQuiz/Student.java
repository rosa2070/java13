package arrayQuiz;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Book> bookList; 
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();		
	}
	
	public void addBook(String name, int bookNum) {
		Book book = new Book(name, bookNum);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print( studentName + " 학생이 읽은 책은 : ");
		
		for( Book book : bookList) {
					
			System.out.print(book.getName() + book.getBookNum() + " ");
		}
		System.out.println("입니다");
	}

}
