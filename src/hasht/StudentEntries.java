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
public class StudentEntries<K,V>{
    private K Key;
    private V Value;
        
    public StudentEntries(K key, V value){
        this.Key = key;
        this.Value = value;
    }
    public K getKey() {
        return this.Key;
    }
    public V getValue() {
        return this.Value;
    }
    public void setValue(V v) {
        this.Value = v;
    }
}  
