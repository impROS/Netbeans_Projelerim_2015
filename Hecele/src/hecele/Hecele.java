/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hecele;

//Copyright (C) 2003 Suhan DUMAN

//The algorithm translated from Perl to Java.
//The Perl version is generated by Engin GUNDUZ.

//This program is free; you can redistribute it and/or modify it.
//For your comments : suhan@turkserve.net


import java.awt.*;
import java.awt.event.*;

public class Hecele extends Frame{
	
	String sesliler="aeıioöuü";
	String sessizler="bcçdfgğhjklmnprsştvyz";
	Button b1;
	TextField tf1,tf2;
	String dizilis,durum,heceler;
	int uzunluk;	
			
	Hecele(){
		
		b1=new Button("Hecele");
		tf1=new TextField(40);
		tf2=new TextField(40);
		setTitle("Türkçe Heceleme");
		setLayout(new GridLayout(3,1));
		add(tf1);
		add(tf2);
		add(b1);
		pack();
		setVisible(true);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				/********************/
				tf2.setText(hecelereBol(tf1.getText()));
				/********************/
				}
				});
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
				System.exit(0);
				}
			});
		}
	
	public static void main(String args[]){
		Hecele he=new Hecele();
		}

/*****************************************************/	
/*****************************************************/	

public String hecelereBol(String kelime){
	int j=0;
	dizilis="";
	durum="";
	heceler="";
	uzunluk=kelime.length();
		
	for(int i=0;i<uzunluk;i++){
		char c=kelime.charAt(i);
		if(sesliler.indexOf(c)>-1)
		dizilis+='o';
		
		if(sessizler.indexOf(c)>-1)
		dizilis+='X';
		}
		
		System.out.println("Dizilis Sekli : " + dizilis);
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	/////FINITE STATE MACHINE/////////////////////
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	
  durum = "DURUM_NULL";
  
  while(j <= dizilis.length()){
    
  if(durum== "DURUM_NULL"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_o";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_X";  
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
    
  if(durum== "DURUM_X"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";        
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XX";  
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
  
  if(durum== "DURUM_XX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_XXo";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        System.out.println("Hata : " +  dizilis);
        return "Hata";  
      }
    
    }
  
  if(durum== "DURUM_XXo"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_o";
        heceler+= "_" +  kelime.charAt(j-4) + kelime.charAt(j-3) + kelime.charAt(j-2);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XXoX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-4) + kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
   
 if(durum== "DURUM_XXoX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XXoXX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
  
  if(durum== "DURUM_XXoXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-6) + kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XXoXXX";
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
  
  if(durum== "DURUM_XXoXXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-7) + kelime.charAt(j-6) + kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XX";
        heceler+= "_" +  kelime.charAt(j-7) + kelime.charAt(j-6) + kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
  
  if(durum== "DURUM_Xo"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_o";
        heceler+= "_" +  kelime.charAt(j-3) + kelime.charAt(j-2);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XoX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
 
   if(durum== "DURUM_XoX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XoXX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-4) + kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
  
  if(durum== "DURUM_XoXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_XoXXX";
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
 
   if(durum== "DURUM_XoXXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-6) + kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        System.out.println("Hata : " +  dizilis);
        return "Hata";  
      }
    
    }
  
  if(durum== "DURUM_o"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_o";
        heceler+= "_" +  kelime.charAt(j-2);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_oX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
 
   if(durum== "DURUM_oX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_oXX";
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }
    
    }
 
   if(durum== "DURUM_oXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_oXXX";
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
 
   if(durum== "DURUM_oXXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_Xo";
        heceler+= "_" +  kelime.charAt(j-5) + kelime.charAt(j-4) + kelime.charAt(j-3);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        durum = "DURUM_oXXXX";
        if(j == dizilis.length()){
          System.out.println("Hata : " +  dizilis);
          return "Hata";
        }
      }
    
    }
  
  if(durum== "DURUM_oXXXX"){
      if(dizilis.charAt(j)=='o'){
        j++; 
        durum = "DURUM_XXo";
        heceler+= "_" +  kelime.charAt(j-6) + kelime.charAt(j-5) + kelime.charAt(j-4);
        if(j == dizilis.length()){
          heceler+= "_" +  kelime.charAt(j-3) + kelime.charAt(j-2) + kelime.charAt(j-1);
          break;
        }
      }else{
        j++;
        System.out.println("Hata : " +  dizilis);
        return "Hata";  
      }
    
    }
  }

	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	return heceler.substring(1);
}
/*****************************************************/	
/*****************************************************/	
}

