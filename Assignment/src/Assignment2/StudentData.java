package Assignment2;

public class StudentData {

	
		   private int stuID;
		   private String stuName;
		   private int stuAge;
		 

		   public StudentData() {}//default 

		   public StudentData(int id, String name, int age) {
			   this.stuID=id;
			   this.stuName=name;
			   this.stuAge=age;
		   }
		

		public int getStuID() {
			return stuID;
		}

		public void setStuID(int stuID) {
			this.stuID = stuID;
		}

		public String getStuName() {
			return stuName;
		}

		public void setStuName(String stuName) {
			this.stuName = stuName;
		}

		public int getStuAge() {
			return stuAge;
		}

		public void setStuAge(int stuAge) {
			this.stuAge = stuAge;
		}

		public static void main(String args[])
		   {
		       //This object creation would call the default constructor
		       StudentData myobj = new StudentData();
		       System.out.println("Student Name is: "+myobj.getStuName());
		       System.out.println("Student Age is: "+myobj.getStuAge());
		       System.out.println("Student ID is: "+myobj.getStuID());
		
		       System.out.println("Student Name is: "+myobj.getStuName());
		       /*This object creation would call the parameterized
		        * constructor StudentData(int, String, int)*/
		       StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
		       
		       System.out.println("Student Name is: "+myobj2.getStuName());
		       System.out.println("Student Age is: "+myobj2.getStuAge());
		       System.out.println("Student ID is: "+myobj2.getStuID()); 
		  }
}
