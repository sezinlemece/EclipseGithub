package homeWork1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)", 235.99, "Engin Demiro�" );
		
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)", 259.90, "Engin Demiro�");
	
		Course [] courses = {course1,course2};
		
				
		for (Course course : courses) {
			System.out.println(course.name);

			
		}
		
		
	}

}
