/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message1;

/**
 *
 * @author quoch
 */
public class Queue {
    MyMessage Mes = new MyMessage();
    Stack Sta  = new Stack();
   protected String [] a;
   protected int max =10;
   protected int first, last;
   public Queue(){
    a = new String[max];
    first = last = -1;
}
   public boolean isEmpty(){
       return (first == -1);
   }
   public boolean isFull(){
       return((first == 0 && last == max -1) || first == last +1);
   }
   public void enqueue(String Message){
       if(isFull()){
           System.out.println("Full");
       }else{
           Mes.setMessage(Message);
           if(last == max -1 || last == -1){
               a[0] = Mes.getMessage();
               last = 0;
               if(first ==-1){
                   first = 0;
               }
           }else{
               a[++last] = Mes.getMessage();
           }
       }
   }
   public Object front() {
       if(isEmpty())System.out.println("the queue is empty");
       return a[first];
   }
    public void dequeue(){
        if (isEmpty())System.out.println("this queue is empty");
           
        Sta.push(a[first]);
       if (first == last){
           if(first == 0 && last ==0){
               a[first] = null;
               first = last = -1;
               
           }else{
           first = last -1;
           }
       }else if (first == max -1 ){
           first = 0;
       }else{
           first++;
       }
    }
    void display(){
        for(int i = 0 ; i<a.length;i++){
            if(a[i] == null) break;
            System.out.println(a[i]);
        }
    }
    void displaystack(){
        String[] stack = this.Sta.stack;
        for(int i = 0 ; i<stack.length;i++){
            if(stack[i]==null) break;
            System.out.println(stack[i]);
        }
        }
    }
    
