
package garbagecollector;

import java.util.ArrayList;  
import java.util.List;  
public class GarbageCollector {

 
    public static void main(String[] args) throws Exception { 
   
        List<String> temp = new ArrayList<String>();  
  
        Thread.sleep(10000);  
        while (true) {  
  
            temp.add("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
            //System.out.println(temp.size());  
              
            if(temp.size() > 3000000) {  
                temp = null;  
                temp = new ArrayList<String>();  
                  
            }  
        }  
    }
    
}
