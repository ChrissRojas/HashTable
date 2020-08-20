/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasht;

/**
 *
 * @author chris_000
 */
public class Student {
    private int studentNum;
    private String surname;
    
    public Student(String sn, int studentNum){
        this.studentNum = studentNum;
        this.surname = sn;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public int getStudentNum(){
        return this.studentNum;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setStudentNum(int num){
        this.studentNum = num;
    }
}
