package in.priya.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.priya.entity.Student;
import in.priya.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studRepo;
	
	
	@PostMapping("student")
	public String saveStudent(@RequestBody Student s)
	{
	    studRepo.save(s);
		return "Record saved";
	}
	
	@GetMapping("students")
	public Iterable<Student> getAllStudents()
	{
		  return studRepo.findAll();
	}

}
