package it.ibs.registro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.ibs.registro.model.Lesson;
import it.ibs.registro.service.Lesson_Service;

@RestController
@RequestMapping("/api/v1")
public class Lesson_Controller {

	@Autowired
	private Lesson_Service lesson_service;
	
	@PostMapping("/addLesson")
	public void addLesson(@RequestBody Lesson lesson) {
		lesson_service.addLesson(lesson);			
	}
	
	@GetMapping("/getAllLessons")
	public List<Lesson> getAllLessons() {	
			return lesson_service.getAllLessons();
	}

	@PutMapping("/updateLesson")
	public void updateLesson(@RequestBody Lesson lesson) {
		lesson_service.updateLesson(lesson);			
	}	
		
	@DeleteMapping("/deleteLesson/{id}")
		public void deleteLesson(@PathVariable(name="id") long id) {
		 lesson_service.deleteLesson(id);			
	}
	
	@GetMapping("/getLessonbyId")
	public Lesson getLessonbyId(long id) {	
			return lesson_service.getLessonbyId(id);
	}
}
