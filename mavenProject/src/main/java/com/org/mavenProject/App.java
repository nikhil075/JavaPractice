package com.org.mavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.org.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Manager m1 = (Manager) app.getBean("Mngr");
        m1.dowork();
    }
}
