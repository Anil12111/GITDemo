package InterfaceConcept;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HsbcClass hs = new HsbcClass();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.cashbalance();
		
		//dynamic polymorphism
		// child class object can be referred by parent interface reference
		
		UsbankInterface b = new HsbcClass();
		b.credit();
		b.debit();
		b.transfermoney();
		
		
	}

}
