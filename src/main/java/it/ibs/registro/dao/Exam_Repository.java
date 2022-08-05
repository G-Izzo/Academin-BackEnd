package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Exam;

@Repository
public interface Exam_Repository extends JpaRepository<Exam,Long> {

}
