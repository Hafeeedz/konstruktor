/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setter_getter;

/**
 *
 * @author No Jeneng
 */
public class main {

public static void main(String[] args) {
    
user haped = new user();

haped.setUsername("chelsee");
haped.setPassword("theblues");

System.out.println("Username: " + haped.getUsername());
System.out.println("Password: " + haped.getPassword()); 
    
}

}