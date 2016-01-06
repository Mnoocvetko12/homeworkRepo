package student;

public class Student {

	private static final int MAX_AGES_FOR_SCHOLARSHIP = 29;
	private static final int MIN_MONEY_IN_ACCOUNT = 0;
	private static final int MAX_AGE_FOR_COLLEGE = 80;
	private static final int MIN_AGE_FOR_COLLEGE = 12;
	private static final int MAX_YEAR_IN_COLLEGE = 4;
	private static final int MIN_YEAR_IN_COLLEGE = 1;
	private static final double MAX_GRADE = 6;
	private static final double MIN_GRADE = 2;
	
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	
	public Student() {
		setGrade(4.0);
		setYearInCollege(1);
		setDegree(false);
		setMoney(0);
	}


	public Student(String name, String subject, int age) {
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}
	
	public void upYear() {
		if(isDegree == false) {
			this.yearInCollege++;
			if(yearInCollege == MAX_YEAR_IN_COLLEGE) {
				this.isDegree = true;
			}
		}
	}
	
	public double receiveScholarship(double min, double amount) {
		if((min >= MIN_GRADE || min <= MAX_GRADE) && amount > 0 ) {
		if(this.grade >= min && this.age <= MAX_AGES_FOR_SCHOLARSHIP) {
			this.money += amount;
		}
		}
		else {
			System.out.println("Invalid input!");
		}
		return this.money;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
		else {
			this.name = "unknown";
		}
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		if(subject != null) {
			this.subject = subject;
		}
		else {
			this.subject = "unknown";
		}
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		if(grade >= MIN_GRADE || grade <= MAX_GRADE) {
			this.grade = grade;
		}
		
	}

	public int getYearInCollege() {
		return yearInCollege;
	}


	public void setYearInCollege(int yearInCollege) {
		if(yearInCollege >= MIN_YEAR_IN_COLLEGE || yearInCollege <= MAX_YEAR_IN_COLLEGE) {
			this.yearInCollege = yearInCollege;
		}
		else {
			this.yearInCollege = 1;
		}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age > MIN_AGE_FOR_COLLEGE || age < MAX_AGE_FOR_COLLEGE) {
			this.age = age;
		}
		else {
			this.age = 18;
		}
	}


	public boolean isDegree() {
		return isDegree;
	}


	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		if(money > MIN_MONEY_IN_ACCOUNT) {
		this.money = money;
		}
		else {
			this.money = 0;
		}
	}
	
	
	
	
}
