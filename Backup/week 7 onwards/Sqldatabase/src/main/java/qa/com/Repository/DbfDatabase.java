//package qa.com.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;
//
//public class DbfDatabase implements PersonalRepository{
//	@PersistenceContext(unitName = "primary")
//	private EntityManager manager;
//	
//	
//	@Transactional(value = TxType.SUPPORTS)
//	public String getPerson(int id) {
//		repo.findById(id);
//		return null;
//	}
//	
//	@Transactional(value = TxType.SUPPORTS)
//	public String getAllPeople() {
//		repo.findById(id);
//		return null ;
//
//}
//	@Transactional(value = TxType.SUPPORTS)
//public String deletePerson(int id) {
//		repo.findById(id);
//	return null;
//
//}
//	@Transactional(value = TxType.SUPPORTS)
//	public String updatePerson(int id) {
//		repo.findById(id);
//		return null;
//
//	}
//}
