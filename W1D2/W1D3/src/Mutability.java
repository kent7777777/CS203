/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Mutability {
    public static void main(String[] args){
        Person[] persons = new Person[5];
        Person singlePerson = new Person();
        singlePerson.firstName = "John";
        singlePerson.lastName = "Doe";
        for(int i = 0;i < persons.length;i++){
            persons[i] = singlePerson;
        }
        singlePerson.lastName = "Smith";
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i].firstName + " " + persons[i].lastName);
        }
        
        
    }
}
