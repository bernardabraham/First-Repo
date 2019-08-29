package qa.com.Repository;

public interface DbfRepo {
	String getPerson();
	String getAllPeople();
	String deletePerson(int userId);
	String updatePerson(int userId);

}



