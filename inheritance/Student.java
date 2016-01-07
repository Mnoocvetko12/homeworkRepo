package inheritance;

public class Student extends Person {

	private static final int MAX_SCORE = 6;
	private static final int MIN_SCORE = 2;
	private int score;
	
	
//	Student() {
//		System.out.println("Prazen student");
//	}

//	public Student() {
//		this("unknown", 0, false, 0);
//	}
	
	public Student(String name, int age, boolean isMale, int score) {
		super(name, age, isMale);
		setScore(score);
	}
	
	@Override
	public String showPersonInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student\n");
		sb.append("name: " + getName() + "\n");
		sb.append("age: " + getAge() + "\n");
		sb.append("is male: " + super.isMale() + "\n");
		sb.append("Score: " + getScore() + "\n");
		return sb.toString();
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score >= MIN_SCORE || score <= MAX_SCORE) {
			this.score = score;
		}
		
	}
	
	
}
