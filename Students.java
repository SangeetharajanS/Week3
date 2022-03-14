package Assignments;

public class Students {
	public void getstudentinfo(int ID) {
		System.out.println(ID);
	}
	public void getstudentinfo(int ID, String name) {
		System.out.println(ID+" "+name);
	}
	public void getstudentinfo(String email, String phonenumber) {
		System.out.println(email+" "+phonenumber);
	}

	public static void main(String[] args) {
		Students obj =new Students();
		obj.getstudentinfo(3);
		obj.getstudentinfo(3, "sangeeth");
		obj.getstudentinfo("sangeeth@gmail.com","1234567891");

	}

}
