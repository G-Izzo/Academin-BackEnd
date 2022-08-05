package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Lesson_Student;

@Repository
public interface Lesson_Student_Repository extends JpaRepository<Lesson_Student,Long> {

}
