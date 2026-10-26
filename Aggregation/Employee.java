package Aggregation;

public class Employee {

	int eId;
	String eName;
	float eSal;
	Address add;
	
public Employee (int eId, String eName, float eSal, Address addr)
{
	this.eId = eId;
	this.eName = eName;
	this.eSal = eSal;
	this.addr = addr;
	
}
void display()
{
	System.out.println("eId : "+eId);
	System.out.println("eName : "+eName);
	System.out.println("eSal : "+eSal);
	addr.show();
	/*
	System.out.println("Emp City : "+addr.City);
	System.out.println("Emp State : "+addr.state);
	System.out.println("Emp Country : "+addr.country); */
}
}
