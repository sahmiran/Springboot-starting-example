package com.workintech.spring.spring_basics.controler;

import com.workintech.spring.spring_basics.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student") //local hostta /student denirse bu controllera girer genel olarak student ile başlamasını isterse bu controllerın
public class StudentControlle {
    private Map<Long, Student> students = new HashMap<>();

    @PostMapping("/")
    public Student save(@RequestBody Student student){
        students.put(student.getId(),student);
        return student;
    }
    @GetMapping("/")
    public List<Student> findAll(){
        return students.values().stream().toList();
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, Student student){
        students.replace(id,student);
        return students.get(student.getId());
    }
    @DeleteMapping("/{id}")
    public Student delete(@PathVariable Long id){
        Student student=students.get(id);
        students.remove(id,student);
        return student;
    }
 }
