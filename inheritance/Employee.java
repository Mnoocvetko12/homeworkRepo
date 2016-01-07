package inheritance;



public class Employee extends Person {

	private static final int MIN_AGE_FOR_OVERTIME = 18;
	private static final double COEFIVENT_FOR_OVERTIME_PAYMENT = 1.5;
	private static final int EMPLOYEE_DAY_WORK_HOURS = 8;
	private double daySalary;
	
	
	

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	
	public double overtimePerHour() {
		if(getAge() >= MIN_AGE_FOR_OVERTIME) {
			double overtime = (getDaySalary() / EMPLOYEE_DAY_WORK_HOURS) * COEFIVENT_FOR_OVERTIME_PAYMENT ;
			return overtime;
		}
		else {
			return 0;
		}
	}
	
	public double calculateOvertimePayment(double hours) {
		double overtimePayment = hours * overtimePerHour();
		return overtimePayment;
	}
	
	
	@Override
	public String showPersonInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee\n");
		sb.append("name: " + getName() + "\n");
		sb.append("age: " + getAge() + "\n");
		sb.append("is male: " + super.isMale() + "\n");
		sb.append("Day salary: " + getDaySalary() + "\n");
		return sb.toString();
		
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary > 0) {
		this.daySalary = daySalary;
		}
	}
	
	
	
}
