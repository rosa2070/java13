package arrayQuiz;

public class Book {
	
	private String name;
	private int bookNum;
	
	public Book(String name, int bookNum) {
		this.name = name;
		this.bookNum = bookNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	
}
