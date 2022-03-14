package Assignments;

public class Student extends Department {
	
		public void studentName() 
		{
            System.out.println("Student name is : "+"Sangeeth");
	}
		public void studentDept()
		{
			System.out.println("Department Name is "+"Electronics and communication engineering");
		
	}
		public void studentId() {
			long id =51081241l;
			System.out.println("Student id is : "+ id);
		}
		 public static void main(String args[]) {
			 Student obj =new Student();
			 obj.collegeName();
			 obj.collegeCode();
			 obj.collegeRank();
			 obj.studentName();
			 obj.studentId();
			 obj.deptName();		 
		 }

}


