/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab;

/**
 *
 * @author sueda
 */
import static java.util.Collections.list;
import java.util.List;
public class Secretary extends Staff {
	
	 

	public Secretary(int id, String taskInformation, String workingHours) {
		super(id, taskInformation, workingHours);
		
	}
	
	public Courses hocaAtama(Courses course, Lecturer lecturer) {
		if(lecturer.getNumCourses()<10) {
		
		lecturer.addCourse(course);
		course.setLecturer(lecturer); 
		
		}
		else {
			System.out.println("This lecturer Access to max course number.");
		}
		return course;
		
	}
	
	public Courses hocaDegistirme(Courses course, Lecturer lecturer) {
	
		course.getLecturer().deleteCourses(course);
		course.setLecturer(lecturer); 
		lecturer.addCourse(course);
		return course;
		
	}	
	
}
