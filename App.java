package com.practice.durgeshjdbc;

import java.util.List;
import java.util.ListIterator;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext api;
        api = new ClassPathXmlApplicationContext("confi.xml");

        JdbcDao jdao=(JdbcDao)api.getBean("jdao");
        Student emp1=(Student)api.getBean("emp1");
        int status1=jdao.insert(emp1);
        System.out.println("Number of row inserted..."+status1);
        System.out.println("Inserted data.."+emp1);
        
        List<Student>studentList=jdao.getAllStudents();
        ListIterator<Student> employeeListIterator = studentList.listIterator();
        System.out.println("Students: ");
        ListIterator<Student> studentListIterator=studentList.listIterator();
		while (studentListIterator.hasNext()) {
            System.out.println(studentListIterator.next());
        }

    }
}
