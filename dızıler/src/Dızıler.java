import java.util.Scanner;

public class Dızıler {

    public static void main(String[] args) {
       Scanner klv=new Scanner(System.in);
       int[][]not=new int[3][4];
       String[]ogrencıısmı=new String[3];
       int i=0,j=0;
       for(i=0;i<3;i++){
           System.out.println("öğrenci ismi gırınız;");
           ogrencıısmı[i]=klv.next();
           for(j=0;j<4;j++){
               System.out.println("öğrencı noto gırınız;");
               not[i][j]=klv.nextInt();
           }
       }
      
    }
    static double min(int[][]not){
        int min=not[0][0];
        for(int i=1;i<4;i++){
            if(not[i][i]<min){
                min=not[i][i];
            }
        }
        System.out.println("min deger;"+min);
        return min;
    
    }
    
    static double max(int[][]not){
        int max=not[0][0];
        for(int i=1;i<4;i++){
            if(not[i][i]>max){
                max=not[i][i];
            }
        }
        System.out.println("max degerı;"+max);
        return max;
        
    }
    static double ortalama(int[][]not,int [i][i]){
        double ort=0;
        for(i=0;i<4;i++){
             ort = ort+not[i][i];
        }
        return 0;
        
        
    }
}
