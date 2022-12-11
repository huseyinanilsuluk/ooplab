/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ooplab;

/**
 *
 * @author sueda
 */
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

//import java.util.Collection;

public class Test {

    public static void main(String[] args)
   {
       List <String> lecturer=new ArrayList();
       lecturer.add("1, Uraz Kaygılaroğlu");
       lecturer.add("2,Öner Barut");
       lecturer.add("3,Hacer Karacan");
       System.out.println(lecturer);


       List <String>  course = new ArrayList();
       course.add("CENG213 OOP 6");
       course.add("MATH201 DIFFERENTIAL EQUATIONS 6");
       course.add("BM313 BİLGİSAYAR MİMARİSİ 6");
       course.add("BM309 İŞLETİM SİSTEMLERİ 6");
       course.add("CENG205 DATA STRUCTURES 6");
       System.out.println(course);
       
       List <String> student=new ArrayList();
       student.add("Sueda Eren,201180082,2020,lisans");
       student.add("Aleyna İzgi,201180070,2020,lisans");
       
       
       Secretary secretary1=new Secretary("Bilge Metin",1,"Secretary","08.30-17.30");
       Courses appointLecturer = secretary1.appointLecturer(course, lecturer);

       
       HashMap<List,List> map=new HashMap();
       map.put(lecturer, course);
       map.put(lecturer, course);
       map.put(student,course);
       
    }
}
