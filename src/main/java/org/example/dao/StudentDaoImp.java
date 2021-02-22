package org.example.dao;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentDaoImp implements  StudentDao{
    List<Student> list = new ArrayList<>();

    @Override
    public Student saveOrUpdate(Student appUser) {
        
        return null;
    }

    @Override
    public Student findById(int id) {
        if(id == 0){
            throw  new IllegalArgumentException("id shoulde not be 0");
        }

        return list.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return list;
    }
}
