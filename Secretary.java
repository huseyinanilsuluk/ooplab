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
public class Secretary extends Staff
{
    public Secretary(String name,int id, String taskInformation, String workingHours)
    {
        super(name,id,taskInformation,workingHours);
//        this.id=id;
//        this.taskInformation=taskInformation;
//        this.workingHours=workingHours;
    }
    
    //hoca atama
    public Courses appointLecturer(List course, List lecturer)
    {
        if(lecturer.getNumCourses()<10)
        {
            lecturer.addCourses(course);
            course.setLecturer(lecturer);
        }
        else
        {
            System.out.println("This lecturer access to max course number");
        }
        return null;
    }
    
    //ders hocasını değiştirme 
    public Courses changeLecturer(List course, List lecturer)
    {
        course.getLecturer().deleteCourses(course);
        course.setLecturer(lecturer);
        lecturer.deleteCourses(course);
        return (Courses) course;
    }
    
    
}
