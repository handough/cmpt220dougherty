
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	public void addStudent(String student){
		getStudents()[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}
	public void dropStudent(String student){
		int indexOfStudentToDrop = -1;
		
		for (int i = 0; i < numberOfStudents; i++) {
	        if (students[i].equalsIgnoreCase(student)) {
	            indexOfStudentToDrop = i;
	            if (indexOfStudentToDrop != -1) {
	                for (i = indexOfStudentToDrop; i < numberOfStudents; i++)
	                    students[i] = students[i+1];
	            } 
	            numberOfStudents--;
	        }
	    }
	}
	public void clear(){
		for (int i = 0; i < numberOfStudents; i ++){
	        students[i] = null;
	    }
	    numberOfStudents = 0;
	}
}
