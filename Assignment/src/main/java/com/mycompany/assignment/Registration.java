/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author tefy
 */
public class Registration {

    public static void main(String[] args) {
        Login obj = new Login();
        
        
        
        String user = obj.user();
        String pass = obj.strPassword();
        String cell = obj.checkCellPhoneNumber();
        String log = obj.authentication();
        
        
        System.out.println(user);
        System.out.println(pass);
        System.out.println(cell);
        System.out.println(log);
       
    }

     
    
}
