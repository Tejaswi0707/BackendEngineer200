package Java.Day_001;
//animal class
/*
This is a simple class that represents an animal with a name. It has a private field name, and public getter and setter methods to access and modify the name. The class can be used to create instances of animals and manage their names. 
 */

/**
 Javadoc comment 
 */


public class Animal{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}


