/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.prime.businesslogic;

/**
 *
 * @author alumnog
 */
public class Palindrome {
    
    public static boolean isPalindrome(String value){
       // le quita e´pacios y lo pone en minusculas 
        String text= value.replaceAll("\\s", "").toLowerCase();
        
        char[] letras = text.toCharArray();
        
        int count = letras.length;
        
        
       for (char p: letras){
           
           if(p != letras [count -1]){
           return false;
          
           }else{
           count -=1;
            if (count <0){

            return true;}
           
           }
    
    }
        return true;
        
        
    
    }
}
