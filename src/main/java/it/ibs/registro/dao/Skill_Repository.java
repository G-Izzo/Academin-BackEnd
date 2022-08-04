package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.ibs.registro.model.Skill;

@Repository
public interface Skill_Repository extends JpaRepository<Skill,Long> {

}
