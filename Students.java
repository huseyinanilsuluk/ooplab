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
public class Students 
{
    private String name ;
    private float number;
    private int year;
    private List courses[];
    private String term;

    public Students(String name,float number,int year,List courses[],String term)
    {
        this.name = name;
        this.number = number;
        this.year = year;
        this.courses = courses;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setnumber(float number)
    {
        this.number=number;
    } 
    public float getnumber()
    {
        return number;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public int getYear()
    {
        return year;
    }
    public void setCourses(List courses[])
    {
        this.courses=courses;
    }

    public List[] getCourses()
    {
        return courses;
    }
    public void setTerm(String term)
    {
        this.term=term;
    }
    public String getTerm()
    {
        return term;
    }

    void addCourses(List course) 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
   

    
}
