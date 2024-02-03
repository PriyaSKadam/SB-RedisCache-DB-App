package in.priya.repository;

import org.springframework.data.repository.CrudRepository;

import in.priya.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
