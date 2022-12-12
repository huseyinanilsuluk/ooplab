/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab;

import java.util.List;

/**
 *
 * @author sueda
 */

public class Lecturer {
	
	
	private int id;
	private String name;     
    ArrayList<Courses>courses = new ArrayList<Courses>();
	private static final int MAX_COURSES =10;
	
	private int numCourses;

	public Lecturer(int id, String name) {
		
		this.id = id;
		this.name = name;
		//courses = new Arraylist<Courses>();
		courses =new ArrayList<Courses>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList getCourses() {
		return courses;
	}

	public void setCourses(ArrayList courses) {
		this.courses = courses;
	}

	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public void addCourse(Courses course) {
	
		  if(numCourses<MAX_COURSES)
	        {
	            courses.add(numCourses, (Courses)course); 
	            numCourses++;
	        }
	       /* else if(numCourses==MAX_COURSES)
	        {
	             System.out.println("This lecturer access to max course number.!");   
	        }*/
	}
   
    	 public void deleteCourses(Courses course)
    	    {
    	        if(numCourses>0){
    	           
    	                    courses.remove(course);
    	                    numCourses--;
    	                
    	            
    	        }
    	    }
		
       public void showCourses() {
		for(int i =0; i<courses.size(); i++) {
			System.out.println(""+ name + " " + courses.get(i).getName());
		}
		
	}
}
