package arrayQuiz;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("태백산맥", 1);
		studentLee.addBook("태백산맥", 2);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addBook("토지", 1);
		studentKim.addBook("토지", 2);
		studentKim.addBook("토지", 3);
		
		Student studentCho = new Student(1002, "Cho");
		studentCho.addBook("해리포터", 1);
		studentCho.addBook("해리포터", 2);
		studentCho.addBook("해리포터", 3);
		studentCho.addBook("해리포터", 4);
		studentCho.addBook("해리포터", 5);
		studentCho.addBook("해리포터", 6);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();

	}

}
