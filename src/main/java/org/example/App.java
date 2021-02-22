package org.example;

import org.example.config.AppConfig;
import org.example.dao.StudentDao;
import org.example.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    StudentDao dao = context.getBean("userAppDao", StudentDao.class);
    Student createdStudent = dao.saveOrUpdate(new Student("test"));
        System.out.println("createdAppUser = "+createdStudent);

  }
}
