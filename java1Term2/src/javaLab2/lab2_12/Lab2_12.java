package javaLab2.lab2_12;
import java.util.Scanner;

public class Lab2_12 {

    public static void main(String[] args) {
        Scanner getValue = new Scanner( System.in );
        
        System.out.print( "Id: " );
        String courseId = getValue.nextLine();
        
        System.out.print( "Name: " );
        String courseName = getValue.nextLine();
        
        System.out.print( "Student Name: " );
        String studentName = getValue.nextLine();
        
        Course course = new Course(courseId, courseName);
        
        Student student = new Student(studentName, course);
        
        student.displayEnrollment();
        
        getValue.close();
    }
}

class Course {
    private String courseId;
    private String courseName;
    
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    public String getCourseInfo() {
        return this.courseId + ": " + this.courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;
    
    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }
    
    public void displayEnrollment() {
        System.out.println("Student: " + this.studentName);
        System.out.println("Enrolled in: " + this.enrolledCourse.getCourseInfo());
    }
}