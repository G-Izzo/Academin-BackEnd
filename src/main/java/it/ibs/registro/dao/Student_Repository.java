package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student,Long> {

}
