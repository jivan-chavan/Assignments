package banktransaction2;

import banktransaction.Bank;


public class SBI extends Bank  {

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * System.out.println("clone method called"); return super.clone(); }
	 */
	@Override
	public void a() {
		// TODO Auto-generated method stub
		super.a();
	}

	@Override
	protected void b() {
		// TODO Auto-generated method stub
		super.b();
	}

	public static void m1() {
		System.out.println("m1 satic method of child class SBI");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
//		SBI s1= new SBI();
//		s1.b();
//		
//		SBI s2=(SBI) s1.clone();
//		
//		s2.b();
		
		Bank b1 =new SBI();
		b1.m1();
		
		SBI s = new SBI();
		s.m1();
		
		
	}
}
