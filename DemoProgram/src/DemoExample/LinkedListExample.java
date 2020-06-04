package DemoExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		Book book=new Book(123, 400,"java","james gosling", "O'Reilly & Associates, Inc.");
		Book book1=new Book(123, 400,"java","james gosling", "O'Reilly & Associates, Inc.");
		Book book2=new Book(123, 400,"java","james gosling", "O'Reilly & Associates, Inc.");
		
		LinkedList<Book> list=new LinkedList<Book>();
		list.add(book);
		list.add(book1);
		list.add(book2);
		
		System.out.println("ID :" + " " + "quantity :"+ " " + "name :" + " " + "author :" + " " + "publisher :");
		Iterator<Book> it=list.iterator();
		while(it.hasNext()){
			Book b=(Book)it.next();
			System.out.println(b.ID + " " +b.quantity + " " +b.name + " " + b.author + " " + b.publisher);
		}
	}

}


class Book{
	int ID,quantity;
	String name,author,publisher;
	
	Book(int ID,int quantity,String name,String author,String publisher){
		this.ID=ID;
		this.quantity=quantity;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
}
