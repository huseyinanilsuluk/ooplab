/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab;

/**
 *
 * @author sueda
 */
public class Staff 
{
    private String name;
    private int id;
    private String taskInformation;
    private String workingHours;
    
    public Staff(String name,int id, String taskInformation, String workingHours)
    {
        super();
        this.name=name;
        this.id=id;
        this.taskInformation=taskInformation;
        this.workingHours=workingHours;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setTaskInformation(String taskInformation)
    {
        this.taskInformation=taskInformation;
    }
    public String getTaskInformation()
    {
        return taskInformation;
    }
    public void setWorkingHours(String workingHours)
    {
        this.workingHours=workingHours;
    }
    public String getWorkingHours()
    {
        return workingHours;
    }
}
