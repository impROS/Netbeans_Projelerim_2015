package javaapplication89;


//Ali Perisan

public class JavaApplication89 {

    public static void main(String[] args) {
     
        int yukseklik = 9, genislik = 7;

        System.out.println("7x9'luk bir oval;");

        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 0) {
                    System.out.print(" ");
                } else if (i == 0 && j == 5 || i == 0 && j == 6 || i == 1 && j == 6) {
                    System.out.print(" ");
                } else if (i == 8 && j == 0 || i == 8 && j == 1 || i == 7 && j == 0) {
                    System.out.print(" ");
                } else if (i == 7 && j == 6 || i == 8 && j == 6 || i == 8 && j == 5) {
                    System.out.print(" ");
                } else if (i == 1 && j == 1 || i == 1 && j == 5 || i == 8 && j == 1 || i == 7 && j == 1 || i == 7 && j == 5) {
                    System.out.print("*");
                } else if (i == 0 || i == yukseklik - 1 || j == 0 || j == genislik - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
