
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class common {
     private static ArrayList<Integer> FindCommonElement(Stack<Integer> st, Queue<Integer> q) {
       int size=0;
       ArrayList<Integer>CommonElement =new ArrayList<Integer>();
       while(q.size()>0){
           st.push(q.poll());
           size++;       
       }
       while(size!=0){
           q.add(st.pop());
           size--;
       }
       while(!st.isEmpty() && q.size()!=0){
           int x=st.peek();
           int y=q.peek();
           if(x==y)
            CommonElement.add(x);
           if(x>y)
               st.pop();
           else
               q.poll();
       }
         return CommonElement;
    
     }
 public static void main (String[] args){
     Stack<Integer>st=new Stack<Integer>();
     st.add(1);
     st.add(3);
     st.add(5);
     st.add(7);
     Queue<Integer>q =new LinkedList<Integer>();
     q.add(1);
     q.add(2);
     q.add(5);
     q.add(9);
     
     ArrayList<Integer>a=FindCommonElement(st,q);
     if(a.size()==0)
         System.out.print("Not Found");
     for(int i=0;i<a.size ();i++)
         System.out.print(a.get(i)+ "");
         
     
     
     
     
 }}   

   
    
    

