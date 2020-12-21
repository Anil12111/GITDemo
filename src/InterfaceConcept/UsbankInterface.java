package InterfaceConcept;

public interface UsbankInterface {
	
	/*
	 * Notes: Interface looks like a class but it is not a class. 
	 * 
	 * An interface can have methods and variables just like the class but the methods declared in
	 * interface are by default abstract (only method signature, no body, see: Java
	 * abstract method). 
	 * Also, the variables declared in an interface are public,
	 * static & final by default.
	 * no static methods in interface
	 * no main method in interface
	 * we can create the object of interface
	 */
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();

}
