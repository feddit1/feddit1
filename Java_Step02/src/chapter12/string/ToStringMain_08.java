package chapter12.string;

class Book {

	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}

}

public class ToStringMain_08 {

	public static void main(String[] args) {

		Book b = new Book("Java", "hide");
		System.out.println(b);
		System.out.println(b);
		// 멤버변수를 직접 호출하여 확인
		System.out.println(b.title);
		System.out.println(b.author);
		System.out.println();
		System.out.println(b.toString());

	}

}
