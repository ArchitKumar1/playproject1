package services;

import models.student;
import models.teacher;


public class display_homepage {
    public static String getAllStudents(){
        student s = new student(1234,"archit",23,"Mumbai, India");
        String answer  = s.getStudentId() + s.getName() +s.getAge() +s.getAddress();
        return answer;
    }
    public static String getAllTeachers(){
        teacher s = new teacher(1234,"archit",23,"Mumbai, India");
        String answer  = s.getTeacherId()+ s.getName() +s.getAge() +s.getAddress();

        return answer;
    }
}
