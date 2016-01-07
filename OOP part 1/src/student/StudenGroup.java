package student;

public class StudenGroup {

	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudenGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public StudenGroup(String groupSubject) {
		this();
		setGroupSubject(groupSubject);
	}

	public void addStudent(Student student) {
		if (student != null) {
			for (int i = 0; i < students.length; i++) {
				if (this.groupSubject.equalsIgnoreCase(student.getSubject()) && students[i] == null && freePlaces > 0) {
					this.students[i] = student;
					this.freePlaces--;
					break;
				}
			}
		}
	}

	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public String bestStudent() {

		String bestStudName = students[0].getName();

		for (int i = 0; i < students.length - 1; i++) {
			if (students[i + 1] == null) {

				break;
			} else {

				if (this.students[i].getGrade() < this.students[i + 1].getGrade()) {

					bestStudName = this.students[i + 1].getName();
				} else {

					if (this.students[i].getGrade() == this.students[i + 1].getGrade()) {
						bestStudName += " ";
					    bestStudName += this.students[i + 1].getName();
					}
					else {
						break;
					}
				}
			}
		}
		return bestStudName;
	}

	public void printStudentsInGroup() {

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("Name: " + students[i].getName());
				System.out.println("Subject: " + students[i].getSubject());
				System.out.println("Grade: " + students[i].getGrade());
				System.out.println("Year in college: " + students[i].getYearInCollege());
				System.out.println("Age: " + students[i].getAge());
				System.out.println("Is degree: " + students[i].isDegree());
				System.out.println("Money: " + students[i].getMoney());
				System.out.println();
			} else {
				break;
			}
		}

	}

	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		if (groupSubject != null) {
			this.groupSubject = groupSubject;
		} else {
			this.groupSubject = "No subject";
		}
	}

}
