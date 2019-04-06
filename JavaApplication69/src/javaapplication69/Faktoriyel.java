/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author impROS
 */
public class Faktoriyel extends Applet implements ActionListener{

    Button btn;
    TextField girilen;
    Label sayi,bitti;
    int num;
    int hesaplanan=1;
    
    public void init(){
        setSize(250, 400);
        setLayout(new FlowLayout());
        sayi = new Label("Sayı");
        girilen = new TextField(15);
        btn = new Button("Hesapla");
        bitti = new Label();
        btn.addActionListener((ActionListener) this);
        add(sayi);
        add(girilen);
        add(btn);
        add(bitti);
    }

    public void actionPerformed(ActionEvent e) {
        hesaplanan=1;
        if(e.getSource()==btn){
            num = Integer.parseInt(girilen.getText());
            for (int i = num; i >1; i--) {
                hesaplanan *=i; 
            }
            bitti.setText(Integer.toString(hesaplanan));
        }
    }
}