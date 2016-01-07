package inheritance;

/*
 * po vyprosa s constructor-a Student() {} mislq che e vyzmojno stiga da izvikame 
 * s dumichkata this drugiqt constructor i mu podadem default-ni stoinosti kakto
 * sym napravil v klasa taka bihme mogli da syzdadem obekt s prazen constructor i
 * chres set-yri da dobavim nujnite stoinsotti dr. variant koito otkrih e da izwikame 
 * constructor-a na roditelskiqt class i v super() da podadem default-ni stoinostti
 * no togava shte narushim dobrata praktika da ne se vika roditelskiqt klass v poveche
 * ot edin child constructor :) zabelqzoh che mojem da syzdadem i prazen constructor 
 * ako syzdadem prazen takyv i v roditelskiqt class i mi se struva che izvikam li Student()
 * avtomatichno izvikvam i Person() emi tova e koeto razbrah mojem da syzdadem prazen Student()
 * stiga da sme posochili koi tocho roditelski constructor da nasledqva ili ako nasledi constructor
 * ot class Student() 
 * (bih iskal da se izvinq za nastoqshtiqt tekst na ezik svinshtina no ne mi se riskuva da ne stava za chetene
 * makar che ako gresha shte e po dobre da ne se razchita) 
 */


public class Main {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Person vanio = new Person("Vanio", 32, true);
		Person daniela = new Person("Daniela", 23, false);

		Student ivan = new Student("Ivan", 19, true, 5);
		Student stoqnka = new Student("Stoqnka", 21, false, 6);

		Employee toshko = new Employee("Toshko", 32, true, 68);
		Employee tihomira = new Employee("Tihomira", 29, false, 55);


		addPeople(people, vanio);
		addPeople(people, stoqnka);
		addPeople(people, toshko);
		addPeople(people, daniela);
		addPeople(people, ivan);
		addPeople(people, tihomira);
		showPeopleInfo(people);
		people[4] = null;
	
//		showPeopleInfo(people);
//		showEmployeeOvertimePayment(people);

	}

	public static void addPeople(Person[] people, Person person) {
		for (int i = 0; i < people.length; i++) {
			if(people[i] == null) {
				people[i] = person;
				return;
			}
		}
	}
	
	public static void showEmployeeOvertimePayment(Person[] people) {
		for (int i = 0; i < people.length; i++) {
			if(people[i] != null) {
				if(people[i] instanceof Employee) {
					Employee emp = (Employee)people[i];
					System.out.println("Overtime payment: " + emp.calculateOvertimePayment(2));
				}
			}
		}
	}
	
	public static void showPeopleInfo(Person[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Employee) {

					Employee emp = (Employee) people[i];
					System.out.println(emp.showPersonInfo());
				} else {
					if (people[i] instanceof Student) {

						Student stud = (Student) people[i];
						System.out.println(stud.showPersonInfo());
					} else {

						System.out.println(people[i].showPersonInfo());
					}
				}

			} else {
				continue;
			}
		}
	}

}
