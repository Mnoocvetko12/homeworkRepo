package inheritance;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
//	public Person() {
//		System.out.println("Prazen person");
//	}
	
	
	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setMale(isMale);
	}
	
	
	public String showPersonInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Person\n");
		sb.append("name: " + getName() + "\n");
		sb.append("age: " + getAge() + "\n");
		sb.append("is male: " + isMale() + "\n");
		
		return sb.toString();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null) {
		this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 || age < 100) {
		this.age = age;
		}
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
}
