
public class TestCourse {
	public static void main(String[] args){
		Course c = new Course("Course");
		
		for (int i = 0; i < 20; i++) {
            c.addStudent("Student " + (i + 1));
            c.addStudent("Student " + (i + 1));
            c.addStudent("Student " + (i + 1));
        }
		
		String[] students = c.getStudents();
	}
}

