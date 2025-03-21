package session4;

public class ConstructoroverloadingEx {
	
	private String empname;
	private int empid;
	private String location;
	
	public  ConstructoroverloadingEx( String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public ConstructoroverloadingEx(String empname, String location) {                                                                                              
		this(empname, 0, location ); //call invoke using this keyword
	}
	public ConstructoroverloadingEx(String empname, int empid) {
		this(empname,empid,null);
	}

	public void dispalyInfo() {
		System.out.println("Empname: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
	public static void main(String[] args) {
		 ConstructoroverloadingEx  cox = new  ConstructoroverloadingEx ("Girija", 1503 , "Coimbatore");
		 ConstructoroverloadingEx cox1 = new ConstructoroverloadingEx("Aashika",0,"coimbatore");
		 ConstructoroverloadingEx cox2 = new ConstructoroverloadingEx("Sudhi",54531,"null");
		 cox.dispalyInfo();
		 cox1.dispalyInfo();
		 cox2.dispalyInfo();
	}
}
