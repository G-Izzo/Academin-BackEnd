package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Lesson;

@Repository
public interface Lesson_Repository extends JpaRepository<Lesson,Long> {

}
