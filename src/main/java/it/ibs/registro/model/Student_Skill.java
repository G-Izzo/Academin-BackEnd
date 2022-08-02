package it.ibs.registro.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="student_skill")
public class Student_Skill {
	
	 @Column(name = "student_id")
	 Long studentId;

	 @Column(name = "skill_id")
	 Long courseId; 

	public Student_Skill() {}

	public Student_Skill(Long id, Rating myRating) {
	
		this.myRating = myRating;
	}
		
	@Enumerated(EnumType.STRING)	
    private Rating myRating;

	public Rating getMyRating() {
		return myRating;
	}

	public void setMyRating(Rating myRating) {
		this.myRating = myRating;
	}
	  
	  
}
