/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkarpik;

/**
 *
 * @author pkarpik
 */
public class Person {
    
    private String name;
    private Long age;

    public Person(){
    }
    
    public Person(String name, Long age){
        this.name=name;
        this.age=age;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Long getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Long age) {
        this.age = age;
    }
    
    
}
