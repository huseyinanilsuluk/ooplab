/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab;

/**
 *
 * @author sueda
 */
import java.util.List;
public class Mentor extends Lecturer
{
    public Mentor(int id, String name) 
    {
        super(id, name);
    }
    
    public Courses appointStudent(List course,Students students)
    {
        students.addCourses(course);
        course.setStudents(students);
        return null;
    }
   
}
