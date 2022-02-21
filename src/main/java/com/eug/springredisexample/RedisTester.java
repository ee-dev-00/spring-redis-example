package com.eug.springredisexample;

import org.springframework.stereotype.Component;

@Component
public class RedisTester {

    private final StudentRepository studentRepository;

    public RedisTester(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student insertOne() {
        var student = new Student();
        student.setName("Eugeniy");
        student.setGender(Student.Gender.NON_BINARY);
        student.setId("euge" + System.currentTimeMillis());
        student.setGrade(4);

        return studentRepository.save(student);
    }

    public Student findOne(String id) {
        return studentRepository.findById(id).orElseThrow();
    }
}
