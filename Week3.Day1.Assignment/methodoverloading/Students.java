package methodoverloading;

import org.openqa.selenium.By;

public class Students {
	public void getStudentInfo(String name,int id) {
		System.out.println("Student Name: "+name+" Id: "+id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id: "+id+" Name: "+name);
	}

	public void getStudentInfo(String email, String name) {
		System.out.println("Student Email: "+name+" Id: "+name);
	}

	public void getStudentInfo(int phoneNumber, int id) {
		System.out.println("Student Phone Number: "+phoneNumber+" Id: "+id);
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(12345, 20);
		s.getStudentInfo(34, "rahul");
		s.getStudentInfo("Hema", 45);
		s.getStudentInfo("test123@gmail.com", "Sundhar");
	}


}
