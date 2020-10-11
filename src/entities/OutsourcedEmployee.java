package entities;

public class OutsourcedEmployee extends Employee {

	private Double addtionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + addtionalCharge * 1.1;
	}

}
