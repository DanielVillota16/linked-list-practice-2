package ui;

import java.io.IOException;
import model.Course;
import model.Student;

public class Main {
	
	private static Course course;

	public static void main(String[] args) throws IOException {
		
		Student j = new Student("Juanito", 3.5);
		Student c = new Student("Camilo", 5.0);
		Student p = new Student("Pedro", 4.0);
		Student h = new Student("Hector", 4.5);
		j.setNext(c);
		c.setNext(p);
		c.setPrevious(j);
		p.setNext(h);
		p.setPrevious(c);
		h.setPrevious(p);
		
		course = new Course(j);
		
		printStudents();
		printFirst();
		
		boolean deleted = course.deleteStudent("Hector");
		System.out.println("Deleted (Hector) : " + deleted + "\n");
		
		printStudents();
		printFirst();
		
		boolean deleted2 = course.deleteStudent("Juanito");
		System.out.println("Deleted (Juanito): " + deleted2 + "\n");
		
		printStudents();
		printFirst();
		
		boolean deleted3 = course.deleteStudent("Camilo");
		System.out.println("Deleted (Camilo): " + deleted3 + "\n");
		
		printStudents();
		printFirst();
		
		boolean deleted4 = course.deleteStudent("Pedro");
		System.out.println("Deleted (Pedro): " + deleted4 + "\n");
		
		printStudents();
		printFirst();
		
	}
	
	
	public static void printStudents() {
		Student temp2 = course.getFirst();
		while (temp2 != null) {
			System.out.println(temp2.getName()
			+ "\t Prev: " + temp2.getPrevious()
			+ "\t Next: " + temp2.getNext());
			temp2 = temp2.getNext();
		}
		System.out.println();
	}
	
	public static void printFirst() {
		System.out.println("First: " + course.getFirst() + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
}
