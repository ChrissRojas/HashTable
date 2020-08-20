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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTable table = new HashTable();
        
        table.put(new Student("Rojas",14054980));
        table.put(new Student("Azad",14595943));
        table.put(new Student("Eelm",14595943));
        table.put(new Student("Jones",14595943));
        table.put(new Student("jihyo",14595943));
        table.put(new Student("Lisa",14595943));
        table.put(new Student("Jennie",14595943));
        table.put(new Student("Ji",34243257));
        table.put(new Student("Jiso",3424257));
        table.put(new Student("Js",3424347));
        table.put(new Student("James",3424347));
        table.put(new Student("helpfsdfdsf",3424347));
        table.put(new Student("helpfsdfdkokpo",3424347));
        
        
        System.out.println(table.isEmpty());
        System.out.println(table.size());
        System.out.println(table.loadFactor());
        System.out.println(table.containsSurname("Jiso"));
       
        
        
    }
    
}
