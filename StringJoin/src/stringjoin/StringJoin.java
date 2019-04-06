/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringjoin;

import java.util.Arrays;
import java.util.List;


public class StringJoin {


    public static void main(String[] args){
        String joinedString = String.join( ",", "Volkswagen","Audi","BMW","Mercedes");
        System.out.println("Joined String="+joinedString);
 
        List<String> list = Arrays.asList( "1","2","3","4","5" );
        joinedString = String.join("-",list);
        System.out.println("Joined String="+joinedString);     
    }
}
    

