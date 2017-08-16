package com.hiwotab.springboot10.Repository;
import com.hiwotab.springboot10.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{
}
