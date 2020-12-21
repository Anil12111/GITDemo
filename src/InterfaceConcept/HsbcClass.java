package InterfaceConcept;

public class HsbcClass implements UsbankInterface,BrazilBankInterface {
	
	/*
	 * Notes: if a class implements an interface and it has to implement all the
	 * methods in the interface
	 * in this case we are implementing multiple inheritance as we are using 2 parent interfaces
	 * and this is also called is-a-relation ship as we are using class implements interface in this case
	 * if class extends a class then it is called has-a-relationship
	 */

	public void credit() {
		System.out.println("credit");
	}

	public void debit() {
		System.out.println("debit");
	}

	public void transfermoney() {
		System.out.println("transfer money");
	}

	public void cashbalance() {
		System.out.println("cash balance");
	}
	public void mutualfund() {
		System.out.println("brazil bank method");
	}
}
