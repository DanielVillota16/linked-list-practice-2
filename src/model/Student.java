package model;

public class Student {

	private String name;
	private double average;
	private Student next;
	private Student previous;
	
	public Student(String name, double average) {
		this.setName(name);
		this.setAverage(average);
	}	
	
	public Student getNext() {
		return next;
	}
	
	public Student getPrevious() {
		return previous;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	public void setPrevious(Student previous) {
		this.previous = previous;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
