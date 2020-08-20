/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasht;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author chris_000
 */
public class HashTable{

    private int prime=7;
    private int capacity=16;
    private int size;
    private StudentEntries<String,Student>[] students;
    
    public HashTable(){
        students = new StudentEntries[capacity];
        this.size = 0;
    }
    
    public float loadFactor(){
        return (float)size/capacity;
    }
    
    private int sum(String S){
        int sumChar=0;
        for(int i=0;i<S.length();i++){
            sumChar+= (int)S.charAt(i);
        }
        return sumChar;
    }
    
    private int hash1(int key){
        return key % this.capacity;
    }
    
    private int hash2(int key){
         
        return prime-(key%prime);
    }
    
    /**
     *
     * @param s
     * @return
     */
    public Student put(Student s){
        
        int charSum= sum(s.getSurname());
        int index1= hash1(charSum);
        
        if(students[index1]==null || isEmpty()){
            students[index1] = new StudentEntries<>(s.getSurname(),s);
            size++;
        }
        else if(students[index1].getKey().equals(s.getSurname())){
            students[index1].setValue(s);
        }
        else{
            boolean found=false;
            int i =1;
            int index2=hash2(charSum);
            while(found!=true&&i<=this.capacity){
                int probe = (index1+i*index2)%capacity;
                System.out.println(probe);
                if(students[probe]==null){
                    students[probe] = new StudentEntries(s.getSurname(),s);
                    size++;
                    found=true;
                }else if(students[probe].getKey().equals(s.getSurname())){
                    students[probe].setValue(s);
                    found=true;
                }
                i++;
            }
        }
        return s;
    }
    
    
    public void clear(){
        students = new StudentEntries[capacity];
        size=0;
    }
    
    public boolean containsValue(Student value){
        for(StudentEntries s: students){
            if(value == s.getValue()){
                return true;
            }
        }
        return false;
    }
    
    public boolean containsSurname(String surname){
        for (StudentEntries<String, Student> student : students) {
            if (student!=null) {
                if(student.getKey().equals(surname))
                    return true;
            }
        }
        return false;
    }
    
    public boolean isEmpty(){
        return (size==0);
    }
    
    public int size(){
        return this.size;
    }
    
    private void rehash(){
        
    }

}
