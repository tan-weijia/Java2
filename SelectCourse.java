package test;

import java.util.Scanner;

public class SelectCourse {

	public static void main(String[] args) {
		
	    Course course = new Course();
	    
		System.out.println(course.toString());
		Student stu0 = new Student(20200201,"����","�����","��");
        Student stu1 = new Student(20200202,"����","�����","��");
        Student stu2 = new Student(20200203,"����","�����","��");
        Student stu3 = new Student(20200204,"����","�����","Ů");
        Teacher tea0 = new Teacher(001,"����ʦ","�Ա�Ů");
        Teacher tea1 = new Teacher(002,"����ʦ","�Ա���");
        Teacher tea2 = new Teacher(002,"����ʦ","�Ա�Ů");
        Course cour0 = new Course(01,"Java");
        Course cour1 = new Course(02,"���������̳�");
        Course cour2 = new Course(03,"�ߵ���ѧ");
        stu0.addCourse(cour0);
        stu1.addCourse(cour2);
        stu1.addCourse(cour0);
        stu2.addCourse(cour1);
        stu3.addCourse(cour0);
        tea0.addCourse(cour2);
        tea1.addCourse(cour1);
        tea2.addCourse(cour0);
        stu1.removeCourse(cour0);
        
        
        stu0.displayCourse();
        stu1.displayCourse();
        stu2.displayCourse();
        stu3.displayCourse();
        tea0.displayCourse();
        tea1.displayCourse();
        tea2.displayCourse();
        cour0.removeStudent(stu1);
        cour1.displayStudent();
        
	}

}
