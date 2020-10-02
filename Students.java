package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID:"+ id );

	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID :" + id);
		System.out.println("Name:"+ name);

	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student email:"+ email);
	System.out.println("Phone number:"+ phoneNumber);
	}

	
	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.getStudentInfo(8);
		stu.getStudentInfo(8, "Hari");
		stu.getStudentInfo("shs01@yopmail.com", 987654321);

	}

}
