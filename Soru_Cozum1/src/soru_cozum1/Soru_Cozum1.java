package soru_cozum1;

import java.util.Scanner;

public class Soru_Cozum1 {

    public static void main(String[] args) {
Scanner giris = new Scanner(System.in);

int boy=giris.nextInt();
for(int i=1;i<=20;i++){
if(i<=5){
boy += boy*1/5;
}
else if(i>5&& i<=10){
boy += boy*1/10;
}
else if(i>10 && i<=20){
boy +=boy*1/20;
}
}
        System.out.println("Boy = " + boy );

    }

}
