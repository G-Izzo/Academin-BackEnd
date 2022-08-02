package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lesson_student")
public class Lesson_Student {
	
	public Lesson_Student() {}
	
	public Lesson_Student(String join_time, String exit_time, String daily_grade) {		
		this.join_time = join_time;
		this.exit_time = exit_time;
		this.daily_grade = daily_grade;
	}
	private String join_time;
	private String exit_time;
	private String daily_grade;
	
	public String getJoin_time() {
		return join_time;
	}

	public void setJoin_time(String join_time) {
		this.join_time = join_time;
	}

	public String getExit_time() {
		return exit_time;
	}

	public void setExit_time(String exit_time) {
		this.exit_time = exit_time;
	}

	public String getDaily_grade() {
		return daily_grade;
	}

	public void setDaily_grade(String daily_grade) {
		this.daily_grade = daily_grade;
	}
	
	
}
