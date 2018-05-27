package com.nitin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Calendar;

public class Client {
  public static void main(String []args){
      //object Construction Done by Dev
  /*    Employee eref = new Employee();
      eref.setEid(101);
      eref.setEname("Nitin");
      eref.setAddress("Inidrapuram");
      eref.setGender('M');
      System.out.println("Employee Details" + eref);*/

      //Implement IOC(inversion of control)
     //   org.springframework.core.io.Resource resource = new ClassPathResource("employeebean.xml");
    //    BeanFactory beanFactory = new XmlBeanFactory(resource);
      ApplicationContext context;

           context = new ClassPathXmlApplicationContext("employeebean.xml");

   //   Employee employee = (Employee) beanFactory.getBean("emp1");
   //   Employee employee1 = (Employee) beanFactory.getBean("emp2");
         Employee employee = (Employee) context.getBean("emp1");
         LogFactory LF = (LogFactory) context.getBean("LF");
         Calendar calendar = (Calendar) context.getBean("C");
          Log log =  LF.getInstance("Client.class");
    //     Employee employee1 = (Employee) context.getBean("emp2");
          System.out.println("Employee one details"+employee+calendar.getTime());
   //     System.out.println("Employee two details"+employee1);
          employee.display();
         ((ClassPathXmlApplicationContext) context).close();


  }

}
