/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab;

/**
 *
 * @author sueda
 */
public class Courses 
{
  private String courseCode;
  private String name;
  private int credit;
  private Areas location;
  private Lecturer lecturer;  
  private Students students;
  
    Courses(String courseCode, String name, int credit, Areas location,Lecturer lecturer/*Students[] students*/)
    {
       super();
       this.courseCode=courseCode;
       this.credit=credit;
       this.lecturer=lecturer;
       this.location=location;
       this.name=name;
       this.students=students;
       //kendi ekledi
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  public void setCourseCode(String courseCode)
  {
      this.courseCode=courseCode;
  }
  public String getCourseCode()
  {
      return courseCode;
  }
  public void setCredit(int credit)
  {
      this.credit=credit;
  }
  public int getCredit()
  {
      return credit;
  }
  public void setLocation(Areas location)
  {
      this.location=location;
  }
  public Areas getLocation()
  {
      return location;
  }
  public void setStudents(Students students)
  {
      this.students=students;
  }
    public Students getStudents()
  {
      return students;
  }
  public void setName(String name)
  {
      this.name=name;
  }
  public String getName()
  {
      return name;
  }
  public void setLecturer(Lecturer lecturer)
  {
      this.lecturer=lecturer;
  }
  public Lecturer getLecturer()
  {
    return lecturer;  
  }

    
  
 
  
}


