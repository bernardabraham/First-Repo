package person;

public class PersonApp {
	public static void main(String[] args) {
		PersonManager manager = new PersonManager();
		Person dave = new Person();
		dave.setName("Dave");
		dave.setAge(45);
		dave.setJob("Police");
		Person jeff = new Person(24, "Jeff", "Barista");
		manager.addPerson(dave);
		manager.addPerson(jeff);
		System.out.println(dave);
		System.out.println(jeff);
		manager.listAll();
		System.out.println(manager.findByName("Dave"));
	}

}
// public static void main(String[] args) {
// Person dave = new Person();
// dave.setname("Dave");
// dave.setage(45);
// dave.setjob("Police");
// System.out.println(dave);
// System.out.println(nameCall);
// System.out.println(listCall);
// }

// 1. Create a Person class that models the following:
// a. Name
// b. Age
// c. Job Title
// 2. Create a method to return all three of these in a formatted string.
// HINT: Override the ToString() method.
// 3. Create some example objects with this class.
// 4. Create a List Implementation and store those object inside.
// 5. Use a stream to output all of your people to the console.
// 6. Create a method that can search for a specific Person by their name.