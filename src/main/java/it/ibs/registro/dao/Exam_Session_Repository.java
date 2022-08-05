package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Exam_Session;

@Repository
public interface Exam_Session_Repository extends JpaRepository<Exam_Session,Long> {

}
