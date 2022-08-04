package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ibs.registro.model.Student_Skill;

@Repository
public interface Student_Skill_Repository extends JpaRepository<Student_Skill, Long> {

}
