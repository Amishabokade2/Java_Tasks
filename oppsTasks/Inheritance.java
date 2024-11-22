package oppsTasks;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

class Student extends Person{
	int rollNo;
	String course;
	
	Student(String name, int age, int rollNo, String course){
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("rollNo : " + rollNo);
		System.out.println("Course : " + course);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Student student = new Student("Rohan", 25, 101, "MCA");
		student.display();

	}

}
