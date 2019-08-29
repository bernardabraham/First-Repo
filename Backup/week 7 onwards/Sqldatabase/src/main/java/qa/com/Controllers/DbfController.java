package qa.com.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import qa.com.Entities.Personal;
import qa.com.Repository.PersonalRepository;

@RestController
@CrossOrigin
public class DbfController {

	@Autowired
	private PersonalRepository repo;

	@GetMapping(value = "/show/{id}")
	public String ShowRecord(@PathVariable("id") int id) {
		Optional<Personal> p = repo.findById(id);
		if (p.isPresent()) {
			Personal student = p.get();
			return "Record Found:" + student.getName();
		} else {
			return "Not Found";
		}
	}
	@GetMapping(value = "/showall")
	public List<Personal> ShowAllRecords() {
		List<Personal> p = repo.findAll();
		return p;
	}
	
	
	@GetMapping(value = "/delete/{id}")
	public String DeleteRecord(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Successfully Deleted";
	}
	@GetMapping(value = "/update/{id}")
	public String UpdateRecord(@PathVariable("id") int id) {
		Optional<Personal> p = repo.findById(id);
		if (p.isPresent()) {
			Personal student = p.get();
			return "Record Found:" + student.getName();
		} else {
			return "Not Found";
		}
	}
	
	@PostMapping(value = "/addrecord")
	public String AddRecord(@RequestBody Personal ref) {
		
		repo.save(ref);
		return "Successfully added";
	}


}
