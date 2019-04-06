/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author impROS
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
       { int matris[][] = { { 5,6,7 }, { 8,9, 10, 11, 12} };
listele(matris); }

public static void listele(int matris[][])
{
for(int i=0; i<matris.length; ++i)
{
for(int j=0; j<matris[i].length; ++j)
System.out.print(matris[i][j]+" ");
System.out.println();
}
    }
    
}
