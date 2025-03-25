/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Gift Mashiya
 */

  
        public class PersonalizedGreetingsGenerator {
    private String name;
    private char gender;

    public PersonalizedGreetingsGenerator(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String generateGreeting(){
     String title, greeting;
     
     title= determineTitle();
     greeting = "Hi "+ title + " " + name + ".Welcome to the world of web development.";
     return greeting;}
    
    private String determineTitle(){
       String title="Mr";
       if(gender == 'F' || gender == 'f'){
           title="Ms";
       }
        
    return title;}
}
