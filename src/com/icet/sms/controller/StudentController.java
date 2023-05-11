/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icet.sms.controller;
import com.icet.sms.db.DBConnection;
import com.icet.sms.db.List;
import com.icet.sms.model.Student;

/**
 *
 * @author chanisa
 */
public class StudentController {
    public static boolean addStudent(Student student){
        DBConnection ob = DBConnection.getInstance();
        List studentlist = ob.getStudentList();
        return studentlist.add(student);
    }

    public static Student[] getAllStudent(){
        Object[] objectArray = DBConnection.getInstance().getStudentList().toArray();
        Student[] studentArray=new Student[objectArray.length];
        for(int  i= 0; i<objectArray.length ; i++){
            studentArray[i]=(Student)objectArray[i];
        }
        return  studentArray;
    }

    public static boolean deleteStudent(Student student) {
        DBConnection ob=DBConnection.getInstance();
        List studentlist = ob.getStudentList();
        return studentlist.remove(student);
    }
    
    public static boolean updateStudent(Student student) {
       return DBConnection.getInstance().getStudentList().set(student);
    }

    public static Student getStudent(String id) {
        return DBConnection.getInstance().getStudentList().get(new Student(id, "", 0, 0));
    }

    public static boolean isexists(String id) {
        List studentList=DBConnection.getInstance().getStudentList();
        return studentList.isExist(new Student(id, "", 0, 0));
    }

}
