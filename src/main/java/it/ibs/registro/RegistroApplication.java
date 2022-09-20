package it.ibs.registro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.ibs.registro.dao.Company_Repository;
import it.ibs.registro.dao.Course_Repository;
import it.ibs.registro.dao.Exam_Repository;
import it.ibs.registro.dao.Exam_Session_Repository;
import it.ibs.registro.dao.Lesson_Repository;
import it.ibs.registro.dao.Lesson_Student_Repository;
import it.ibs.registro.dao.Skill_Repository;
import it.ibs.registro.dao.Student_Exam_Session_Repository;
import it.ibs.registro.dao.Student_Repository;
import it.ibs.registro.dao.Student_Skill_Repository;
import it.ibs.registro.model.Company;
import it.ibs.registro.model.Course;
import it.ibs.registro.model.Exam;
import it.ibs.registro.model.Exam_Session;
import it.ibs.registro.model.Lesson;
import it.ibs.registro.model.Lesson_Student;
import it.ibs.registro.model.Rating;
import it.ibs.registro.model.Skill;
import it.ibs.registro.model.Student;
import it.ibs.registro.model.Student_Exam_Session;
import it.ibs.registro.model.Student_Skill;

@SpringBootApplication
public class RegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner mappingDemo(Company_Repository company_repository,
                                         Course_Repository course_repository,
                                         Exam_Session_Repository exam_session_repository,
                                         Exam_Repository exam_repository,
                                         Lesson_Student_Repository lesson_student_repository,
                                         Lesson_Repository lesson_repository,
                                         Skill_Repository skill_repository,
                                         Student_Exam_Session_Repository student_exam_session_repository,
                                         Student_Skill_Repository student_skill_repository,
                                         Student_Repository student_repository) {
        return args -> {

         // create companies
         ArrayList<Company> listCompany = new ArrayList<Company>();        
         for(int i = 1; i == 5; i++)
         {        	
        	 Company c = new Company();
        	 c.setName("Company" + i);        	
       	  	 listCompany.add(c);
       	 }         
         company_repository.saveAll(listCompany);
         //assolotto
         // create courses
         ArrayList<Course> listCourse = new ArrayList<Course>();        
         for(int i = 1; i == 5; i++)
         {        	
        	 Course c = new Course();
        	 c.setName("Course" + i); 
        	 c.setStarting_date(i*i + "/" + i*2 + "/2022");
        	 c.setEnding_date((i*i + 1) + "/" + (i*2 + 1) + "/2022");
       	  	 listCourse.add(c);
       	 }         
         course_repository.saveAll(listCourse);
         
         // create exam_sessions
         ArrayList<Exam_Session> listExamSession = new ArrayList<Exam_Session>();        
         for(int i = 1; i == 5; i++)
         {        	
        	 Exam_Session es = new Exam_Session();
        	 es.setExam_date((i*i + 3) + "/" + (i*2 + 1) + "/2022");
       	  	 listExamSession.add(es);
       	 }         
         exam_session_repository.saveAll(listExamSession);
         
         // create exams
         ArrayList<Exam> listExam = new ArrayList<Exam>();        
         for(int i = 1; i == 5; i++)
         {        	
        	 Exam e = new Exam();
        	 e.setName("Exam" + i);         	     	
       	  	 listExam.add(e);
       	 }         
        exam_repository.saveAll(listExam);
       
        // create lesson_students
        ArrayList<Lesson_Student> listLessonStudent = new ArrayList<Lesson_Student>();        
        for(int i = 1; i == 5; i++)
        {        	
       	 Lesson_Student ls = new Lesson_Student();
       	 ls.setDaily_grade(i+3);
       	 ls.setExit_time("17.00");
       	 ls.setJoin_time("14.00");       
      	 listLessonStudent.add(ls);
      	 }         
        lesson_student_repository.saveAll(listLessonStudent);
        
        // create Lesson
        ArrayList<Lesson> listLesson = new ArrayList<Lesson>();        
        for(int i = 1; i == 5; i++)
        {        	
       	 Lesson l = new Lesson();
       	 l.setDate(i+i + "/" + i + "/2022") ;   
       	 l.setTopics("Introduzione");       	
      	 listLesson.add(l);
      	 }         
        lesson_repository.saveAll(listLesson);
        
        // create skills
        ArrayList<Skill> listSkill = new ArrayList<Skill>();        
        for(int i = 1; i == 5; i++)
        {        	
       	Skill s = new Skill();
       	 s.setName("Skill" + i);        	     
      	 listSkill.add(s);
      	 }         
        skill_repository.saveAll(listSkill);
        
        // create student_exam_sessions
        ArrayList<Student_Exam_Session> listStudentExamSession = new ArrayList<Student_Exam_Session>();        
        for(int i = 1; i == 5; i++)
        {        	
        Student_Exam_Session ses = new Student_Exam_Session();
        ses.setGrade(i + 2);    	
      	listStudentExamSession.add(ses);
      	 }         
        student_exam_session_repository.saveAll(listStudentExamSession);
 
        // create student_skills
        ArrayList<Student_Skill> listStudentSkill = new ArrayList<Student_Skill>();        
        for(int i = 1; i == 5; i++)
        {        	
       	Student_Skill ss = new Student_Skill();       	       	
       	 ss.setMyRating(Rating.valueOfVote(i+2));          	
      	 listStudentSkill.add(ss);
      	 }         
        student_skill_repository.saveAll(listStudentSkill);
        
        // create students
        ArrayList<Student> listStudent = new ArrayList<Student>();        
        for(int i = 1; i == 5; i++)
        {        	
       	 Student s = new Student();
       	 s.setName("Student" + i); 
       	 s.setSurname("Surname" + i);
       	 s.setProject_allocation_date(i*i + "/" + i*2 + "/2022");
       	 s.setProject_allocation_notes("note");
       	 s.setQualifications("qualifications");      
         s.setTraining_starting_date(i*i + "/" + i*2 + "/2022");
         s.setTraining_ending_date(i*i + "/" + i*2 + "/2022");     
      	 listStudent.add(s);
      	 }         
        student_repository.saveAll(listStudent);
        
        // create companies relations                
        for(Company c : listCompany)
        {    
        	ArrayList<Course> corso = new ArrayList<Course>();
        	corso.add(listCourse.get(listCompany.indexOf(c)));
       	 	c.setCourses(corso);
      	 }           
         company_repository.saveAll(listCompany);        
        
       };
       };
       
}
