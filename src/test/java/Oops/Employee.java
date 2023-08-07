package Oops;

public class Employee {
	
	//Variables
	int Eid;
	String EName;
	String ERole;
	int ESalary;
	
	//Constructor
	Employee(int Eid, String EName, String ERole, int ESalary)
	{
		this.Eid=Eid;
		this.EName=EName;
		this.ERole=ERole;
		this.ESalary=ESalary;
	}
	
	//Method
	void display()
	{
		System.out.println(Eid);
		System.out.println(EName);
		System.out.println(ERole);
		System.out.println(ESalary);
		
	}

	public static void main(String[] args) {
		
		//Object
		Employee Em1=new Employee(5599, "Ravi", "Tester", 9999);
		
		Em1.display();
		

	}

}
