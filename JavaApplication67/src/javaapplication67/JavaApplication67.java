/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;
import java.util.Scanner;
/**
 *
 * @author impROS
 */
public class JavaApplication67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     	Scanner input = new Scanner(System.in);
	int kac, f1 = 0,f2 = 1;
	
	System.out.println("Bİr tam sayı giriniz");
	kac = input.nextInt();
	
	for(int i = 0; i < kac; i++)
	{
		int fyedek = f1;
        f1 = f2;
        f2 = fyedek + f2;
	}
	
	System.out.println("İstenilen fibonacci sayisi = " + f1);
    }
    
}
