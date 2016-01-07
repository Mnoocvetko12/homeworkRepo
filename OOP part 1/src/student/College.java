package student;

public class College {

	public static void main(String[] args) {

		Student pesho = new Student("Pesho", "History", 28);
		Student mariq = new Student("Mariq", "History", 21);
		Student gosho = new Student("Gosho", "Physics", 25);
		Student ivanka = new Student("Ivanka", "Computer sciences", 23);
		Student doncho = new Student("Doncho", "History", 31);
		Student stoqnka = new Student("Stoqnka", "Physics", 27);

		pesho.setGrade(3);
		mariq.setGrade(4);
		mariq.receiveScholarship(3, 525);
		pesho.receiveScholarship(3, 200);
		ivanka.upYear();
		gosho.receiveScholarship(4, 150);
		doncho.setMoney(123);
		stoqnka.setYearInCollege(4);
		doncho.setGrade(4);

		StudenGroup sg = new StudenGroup("History");

		sg.addStudent(pesho);
		sg.addStudent(mariq);
		sg.addStudent(gosho);
		sg.addStudent(ivanka);
		sg.addStudent(doncho);
		sg.addStudent(stoqnka);

		System.out.println("Best grade has: " + sg.bestStudent() + "\n");

		// sg.emptyGroup();
//		sg.printStudentsInGroup();
		
		sg.bestStudent();

	}

}
