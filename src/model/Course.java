package model;

public class Course {

	private Student first;
	
	public Course(Student first) {
		this.first = first;
	}
	
	public Student getFirst() {
		return first;
	}
	
	public boolean deleteStudent(String name) {
		Student temp = first;
		boolean ans = false;
		while(temp != null && !ans){
			if(temp.getName().equals(name)) {
				if(temp.getNext() != null && temp.getPrevious() != null) {
					Student p = temp.getPrevious();
					Student n = temp.getNext();
					p.setNext(n);
					n.setPrevious(p);
				} else {
					if(temp.getPrevious() == null) {
						first = temp.getNext();
						if(first != null) {
							first.setPrevious(null);
						}
					} else {
						if(temp.getPrevious() != null) {
							temp.getPrevious().setNext(null);
						}
					}
				}
				temp = null;
				ans = true;
			} else {
				temp = temp.getNext();
			}
		}
		return ans;
	}
	
}
