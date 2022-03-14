package Assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.fixed();
		obj.saving();
		obj.deposit();

	}

}
