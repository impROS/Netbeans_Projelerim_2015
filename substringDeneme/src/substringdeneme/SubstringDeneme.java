/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substringdeneme;

/**
 *
 * @author x.impROS.x
 */
public class SubstringDeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strDeneme = "1,2,4,5,7,";
        System.out.println(strDeneme);
        int beginIndex = 0;
        int endIndex = strDeneme.indexOf(",", beginIndex);

        while (endIndex != -1) {
       
                System.out.println("Sayi = " + strDeneme.substring(beginIndex+1, endIndex));
                beginIndex = endIndex;

                endIndex = strDeneme.indexOf(",", beginIndex + 1);
                //System.out.println("Index" + endIndex);
            }
        
    }

}
