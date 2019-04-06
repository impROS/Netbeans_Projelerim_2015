/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemea;
import java.util.Scanner;
public class Denemea {
public static void main(String[] args) 
{
    Scanner klavye=new Scanner(System.in);
    int kisakenar,uzunkenar,alan,cevre;   
    kisakenar=klavye.nextInt();
    uzunkenar=klavye.nextInt();
    alan=kisakenar*uzunkenar;
    cevre=2*(kisakenar+uzunkenar);
    System.out.println("dikdörtegin alanı="+alan);
    System.out.println("dikdörtgenin cevresi="+cevre);
}
    
}
