package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	
public Exam() {}	

public Exam(Long id, String name, String url) {	
		Id = id;
		this.name = name;
		this.url = url;
	}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String name;
private String url;
public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}


}
