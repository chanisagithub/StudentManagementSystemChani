
package com.icet.sms.db;

import com.icet.sms.model.Student;

/**
 *
 * @author chanisa
 */
public class DBConnection {
    private List studentList;
    private static DBConnection dBConnection;
    
    private DBConnection(){
        studentList=new List();
    }
    public static DBConnection getInstance(){
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
    public List<Student> getStudentList(){
        return studentList;
    }
}
