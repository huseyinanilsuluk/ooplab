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

public class Lecturer
{
    private int id;
    private String name;
    private List courses;
    private int numCourses;
    private static final int MAX_COURSES =10;
   
    
    public Lecturer(int id, String name)
    {
      this.id=id;
      this.name=name;
      //courses=new Courses[MAX_COURSES];
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setCourses(List course)
    {
        this.courses=courses;
    }
    public List getCourses()
    {
        return courses;
    }
    public void setNumCourses(int numCourses)
    {
        this.numCourses=numCourses;
    }
    public int getNumCourses()
    {
        return numCourses;
    }
    
    
    //kurs ekleme
    public void addCourses(List course)
    { 
       
        if(numCourses<MAX_COURSES)
        {
            courses.set(numCourses, (Courses)course); 
            numCourses++;
        }
        else if(numCourses==MAX_COURSES)
        {
             System.out.println("This lecturer access to max course number.!");   
        }
    }
    
    //kurs silme 
    public void deleteCourses(List course)
    {
        if(numCourses>0){
            for(int i=0;i<numCourses;i++)
            {
                if(courses.get(i)==course)
                {
                    //courses.romeove(i);
                    numCourses--;
                }
            }
        }
    }
    
    //kursları gösterme 
    public void showCourses()
    {
        for(int i=0;i<numCourses;i++)
        {
            System.out.println(courses.get(i).getName());
        }
    }
}
