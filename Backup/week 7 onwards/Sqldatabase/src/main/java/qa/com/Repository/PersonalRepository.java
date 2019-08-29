package qa.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qa.com.Entities.Personal;

@Repository
	public interface PersonalRepository extends
	JpaRepository<Personal, Integer>{
		
	}


