package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	public Course() {}

	public Course(Long id, String name, String starting_date, String ending_date) {		
		this.id = id;
		this.name = name;
		this.starting_date = starting_date;
		this.ending_date = ending_date;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;	
	private String starting_date;
	private String ending_date;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarting_date() {
		return starting_date;
	}

	public void setStarting_date(String starting_date) {
		this.starting_date = starting_date;
	}

	public String getEnding_date() {
		return ending_date;
	}

	public void setEnding_date(String ending_date) {
		this.ending_date = ending_date;
	}
	
	
	
}
