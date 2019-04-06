/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;
/*Tüm Hakları mialkan.com'a aittir*/
/*Bir sorunuz olduğunda mialkan@gmail.com adresine mail atabilirsiniz*/

import java.util.Scanner;
public class SayiOyunu {
	
	static char [] row1 = {' ', ' ', ' '};		
	static char [] row2 = {' ', ' ', ' '};		
	static char [] row3 = {' ', ' ', ' '};
	static int adim = 0;
	
	public static void main (String[] args)
	{
		String girilen;
 		
 		String nerede;
 		int intnerede;
		
 		SayiOyunu.new_Matris();
 		
 		while(!(SayiOyunu.row1[0] == '1' && SayiOyunu.row1[1] == '2' && SayiOyunu.row1[2] == '3' && SayiOyunu.row2[0] == '4' && SayiOyunu.row2[1] == '5' && SayiOyunu.row2[2] == '6' && SayiOyunu.row3[0] == '7' && SayiOyunu.row3[1] == '8'))
 		{
 			SayiOyunu.yazdir();
 			
 			nerede = SayiOyunu.bosluk_nerede();
 			intnerede = Integer.parseInt(nerede);
 			girilen = SayiOyunu.Sayi_Gir();
 			
 			if(!girilen.equals("Y"))
			{
 				SayiOyunu.degistir(girilen, intnerede);
			}
 			else
 			{
 				SayiOyunu.new_Matris();
 			}
 			
 		}
 		
 		SayiOyunu.yazdir();
		
		System.out.println("Tebrikler Oyunu Bitirdiniz. Hamle sayınız = " + adim);
	}
	
	public static void yazdir()
	{
		System.out.println("\n\n\n\n");
		System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
		System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
		System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);
		System.out.println();
	}
	
	public static String Sayi_Gir()
	{
		Scanner input = new Scanner (System.in);
		
		String girilen = "";
		
		girilen = input.next();
		
		while( !(girilen.equals("1") ||  girilen.equals("2") || girilen.equals("3") || girilen.equals("4") || girilen.equals("5") || girilen.equals("6") || girilen.equals("7") || girilen.equals("8") || girilen.equals("Y") ))
		{
			System.out.println("Lütfen geçerli bir sayı giriniz. Devam etmek için Enter'a basınız");
			input.nextLine();
			input.nextLine();
				
			System.out.println("\n\n\n\n");
	 		System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
	 		System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
	 		System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);
	 		System.out.println();
	 			
	 		girilen = input.next();
		}
		
		return girilen;
	}
	
	public static void degistir(String girilen, int intnerede)
	{
		Scanner input = new Scanner (System.in);
		
		switch(intnerede)
		{
			case 0:
				adim++;
				if(girilen.charAt(0) == row1[1])
				{
					row1[0] = row1[1];
					row1[1] = ' ';
				}
				else if(girilen.charAt(0) == row2[0])
				{
					row1[0] = row2[0];
					row2[0] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
				    input.nextLine();
				}
			break;
					
			case 1:
				adim++;
				if(girilen.charAt(0) == row1[0])
				{
					row1[1] = row1[0];
					row1[0] = ' ';
				}
				else if(girilen.charAt(0) == row1[2])
				{
					row1[1] = row1[2];
					row1[2] = ' ';
				}
				else if(girilen.charAt(0) == row2[1])
				{
					row1[1] = row2[1];
					row2[1] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
					
			case 2:
				adim++;
				if(girilen.charAt(0) == row1[1])
				{
					row1[2] = row1[1];
					row1[1] = ' ';
				}
				else if(girilen.charAt(0) == row2[2])
				{
					row1[2] = row2[2];
					row2[2] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
					
			case 10:
				adim++;
				if(girilen.charAt(0) == row1[0])
				{
					row2[0] = row1[0];
					row1[0] = ' ';
				}
				else if(girilen.charAt(0) == row2[1])
				{
					row2[0] = row2[1];
					row2[1] = ' ';
				}
				else if(girilen.charAt(0) == row3[0])
				{
					row2[0] = row3[0];
					row3[0] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}	
			break;
					
			case 11:
				adim++;
				if(girilen.charAt(0) == row1[1])
				{
					row2[1] = row1[1];
					row1[1] = ' ';
				}
				else if(girilen.charAt(0) == row2[0])
				{
					row2[1] = row2[0];
					row2[0] = ' ';
				}
				else if(girilen.charAt(0) == row2[2])
				{
					row2[1] = row2[2];
					row2[2] = ' ';
				}
				else if(girilen.charAt(0) == row3[1])
				{
					row2[1] = row3[1];
					row3[1] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
					
			case 12:
				adim++;
				if(girilen.charAt(0) == row1[2])
				{
					row2[2] = row1[2];
					row1[2] = ' ';
				}
				else if(girilen.charAt(0) == row2[1])
				{
					row2[2] = row2[1];
					row2[1] = ' ';
				}
				else if(girilen.charAt(0) == row3[2])
				{
					row2[2] = row3[2];
					row3[2] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
		
			case 20:
				adim++;
				if(girilen.charAt(0) == row2[0])		
				{
					row3[0] = row2[0];
					row2[0] = ' ';
				}
				else if(girilen.charAt(0) == row3[1])
				{
					row3[0] = row3[1];
					row3[1] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
					
			case 21:
				adim++;
				if(girilen.charAt(0) == row2[1])
				{
					row3[1] = row2[1];
					row2[1] = ' ';
				}
				else if(girilen.charAt(0) == row3[0])
				{
					row3[1] = row3[0];
					row3[0] = ' ';
				}
				else if(girilen.charAt(0) == row3[2])
				{
					row3[1] = row3[2];
					row3[2] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}
			break;
					
			case 22:
				adim++;
				if(girilen.charAt(0) == row2[2])
				{
					row3[2] = row2[2];
					row2[2] = ' ';
				}
				else if(girilen.charAt(0) == row3[1])
				{
					row3[2] = row3[1];
					row3[1] = ' ';
				}
				else
				{
					System.out.println("Geçersiz Hamle.Devam etmek için Enter'a basınız");
					input.nextLine();
				}		
		}	
	}
		
	public static String bosluk_nerede()
	{
		String nerede = "";
		
		for ( int i = 0; i<3; i++)
		{
			if(row1[i] == ' ')
			{
				nerede = "0" + i;
			}
			else if(row2[i] == ' ')
			{
				nerede = "1" + i;
			}
			else if(row3[i] == ' ')
			{
				nerede = "2" + i;
			}
		}
		
		return nerede;
	}
	
	public static void new_Matris()
	{
		
		String number = "012345678";
		for(int k = 0; k<3;k++)
		{
			row1[k] = ' ';
			row2[k] = ' ';
			row3[k] = ' ';
		}
		boolean [] row1_Che = {true, true, true};
		boolean [] row2_Che = {true, true, true};
		boolean [] row3_Che = {true, true, true};
		
		int i = 1;
		int row, column;
		
		
		while(row1_Che[0] || row1_Che[1] || row1_Che[2] || row2_Che[0] || row2_Che[1] || row3_Che[2] || row3_Che[0] || row3_Che[1] || row3_Che[2])
		{
			row = (int)(Math.random()*3);
			column = (int)(Math.random()*3);
			
			if(i<9)
			{
				if(row == 0)
				{
					if(row1_Che[column] && column == 0)
					{
						row1_Che[column] = false;
						row1[column] = number.charAt(i);
						i++;
					}
					else if(row1_Che[column] && column == 1)
					{
						row1_Che[column] = false;
						row1[column] = number.charAt(i);
						i++;
					}
					else if(row1_Che[column] && column == 2)
					{
						row1_Che[column] = false;
						row1[column] = number.charAt(i);
						i++;
					}
				}
				else if(row == 1)
				{
					if(row2_Che[column] && column == 0)
					{
						row2_Che[column] = false;
						row2[column] = number.charAt(i);
						i++;
					}
					else if(row2_Che[column] && column == 1)
					{
						row2_Che[column] = false;
						row2[column] = number.charAt(i);
						i++;
					}
					else if(row2_Che[column] && column == 2)
					{
						row2_Che[column] = false;
						row2[column] = number.charAt(i);
						i++;
					}
				}
				else if(row == 2)
				{
					if(row3_Che[column] && column == 0)
					{
						row3_Che[column] = false;
						row3[column] = number.charAt(i);
						i++;
					}
					else if(row3_Che[column] && column == 1)
					{
						row3_Che[column] = false;
						row3[column] = number.charAt(i);
						i++;
					}
					else if(row3_Che[column] && column == 2)
					{
						row3_Che[column] = false;
						row3[column] = number.charAt(i);
						i++;
					}
				}
			}
			
			if(i == 9)
			{
				for(int k=0; k<3; k++)
				{
					if(row1_Che[k])
					{
						row1_Che[k] = false;
					}
					if(row2_Che[k])
					{
						row2_Che[k] = false;
					}
					if(row3_Che[k])
					{
						row3_Che[k] = false;
					}
				}
			}
			
		}
	}

}
