package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	public Student() {}

	public Student(Long id, String name, String surname, String cv_url, String qualifications) {		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.cv_url = cv_url;
		this.qualifications = qualifications;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String cv_url;
	private String qualifications;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCv_url() {
		return cv_url;
	}

	public void setCv_url(String cv_url) {
		this.cv_url = cv_url;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	
	
	
	
}
