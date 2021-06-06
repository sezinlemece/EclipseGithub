package homeWork1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", 235.99, "Engin Demiroð" );
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)", 259.90, "Engin Demiroð");
	
		Course [] courses = {course1,course2};
		
				
		for (Course course : courses) {
			System.out.println(course.name);

			
		}
		
		
	}

}
