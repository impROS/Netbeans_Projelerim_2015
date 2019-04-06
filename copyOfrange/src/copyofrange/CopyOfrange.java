package copyofrange;

import java.util.Arrays;

public class CopyOfrange {

    public static void main(String[] args) {
        byte[] arr1 = new byte[]{1, 2, 3};
        byte[] arr2 = new byte[]{4, 5, 6};
        byte[] arr3 = new byte[]{2, 3, 4};

        byte[] panArr = new byte[arr1.length + arr2.length + arr3.length];
        int from = 0, to = arr1.length, index = 0;

        for (int i = 0; i < panArr.length; i++) {
            if (to == arr1.length) {
                for (; from < to; from++) {
                    panArr[from] = arr1[0];
                }
                from = arr1.length;
                to = arr1.length+arr2.length;
            }else if(to == arr1.length+arr2.length){
            
            }
        }

    }

}

/*
 short[] arr1 = new short[] {15, 10, 45};

 // printing the array
 System.out.println("Printing 1st array:");
 for (int i = 0; i < arr1.length; i++) {
 System.out.println(arr1[i]);  
 }

 // copying array arr1 to arr2 with range of index from 1 to 3
 short[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
   
 // printing the array arr2
 System.out.println("Printing new array:");
 for (int i = 0; i < arr2.length; i++) {
 System.out.println(arr2[i]);
 }
 }
 }

 Printing 1st array:
 15
 10
 45
 Printing new array:
 10
 45
 */
