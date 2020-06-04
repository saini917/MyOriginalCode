package DemoExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		Student s1=new Student("deepak",29,201);
		Student s2=new Student("virender",29,202);
		Student s3=new Student("nirdera",29,202);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Name:" + " " + "Age:" + " " + "RollNo:");
		Iterator<Student> it=list.iterator();
		while(it.hasNext()){
			Student student=(Student)it.next();
			System.out.println(student.name +" " +student.age + " " +student.rollNo);
		}
		
	}
}
	
	class Student{
		String name;
		int rollNo,age;
		
		Student(String name,int age,int rollNo){
			this.name=name;
			this.age=age;
			this.rollNo=rollNo;
		}
		
	}


