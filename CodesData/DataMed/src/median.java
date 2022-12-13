
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaytona
 */
public class median {
    public static int med(int w[]){
        int n=w.length;
        if(n/2 ==0){
            int z=n/2;
            int e=w[z];
            int q=w[z-1];
            
            int result= (q+e)/2;
            return result;
        }
        else{
            int z=Math.round(n/2);
            return w[z];
        }    
        
    }
     public static void main (String[] args){
         int num1[]={1,3,5};
         int num2[]={2,7};
         int i=num1.length;
         int j=num2.length;
         
         int num3[]=new int[i+j];
         System.arraycopy(num1, 0, num3, 0, i);
         System.arraycopy(num2, 0, num3, i, j);
         Arrays.sort(num3);
         System.out.print("median=" + med(num3));
     }
    
}
