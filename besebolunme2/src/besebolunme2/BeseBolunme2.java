/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besebolunme2;

import java.util.Scanner; //Scanner sinifini import ettik
public class BeseBolunme2 
{
    public static void main(String[] args)
    {
Scanner giris=new Scanner(System.in);//Scanneri tanimladik
int sayi1,sayi2;//sayi1 ve sayi2 adÄ±nda iki degisken tanimladik..
System.out.println("Lutfen 1.sayiyi giriniz");//Kullanidan sayi girmesini istedik

sayi1=giris.nextInt();//sayi1'i,klavyeden girilecek olan int degerine esitledik
System.out.println("Lutfen 2.sayiyi giriniz");// Kullanicidan ikinci sayiyi girmesini istedik

sayi2=giris.nextInt();//sayi2'ye klavyeden girilecek olan int degerini atadik
for(int i=sayi1;i<=sayi2;i++)//i=sayi1 ve eger i kucuk esitse sayi2 den,sayiyi 1 artÄ±r ve asagidaki islemleri yap
{  
if(sayi1%7==0)//eger sayi1 in 5 ile bolumunden kalan 0 ise
{
    System.out.print(sayi1+" - ");//ekrana sayiyi ve " - " yaz
}
sayi1++;//sayi1 i  1 artir
}
    }
    
}