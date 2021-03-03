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
public class Stack {
     public int current_size  = -1 ;//stack rong 
    public final int Max_size = 20; // toi da mang
    MyMessage Mes  = new MyMessage();
    public String [] stack = new String[Max_size];// tao mot mang moi co kich co nhao 
    //kiem tra mang rong 
    public boolean isEmpty(){
        return(current_size==-1);
    }
   // kiem tra mgna day 
    public boolean isFull(){
        return(current_size==Max_size);
    }
    //them mot phan tu vao trong mang 
    public void push (String Message){
        Mes.setMessage(Message);
        if(isFull()){
            System.out.println("Full");
        }else{
            current_size++;
            stack[current_size] = Mes.getMessage();
            //System.out.println(stack[current_size]);

        }
    } 
    public String top(){
        if (isEmpty()){
          System.out.println("empty");
        return("empty");
          
        }else{
            return stack[current_size];
        }
   
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("empty");
            return"empty";
        }
        else{
            String data =stack[current_size];
            current_size--;
            return data;
        }

    }
    String display(){
        for(int i = 0 ; i<current_size;i++){
            if(stack[i]==null) break;
            System.out.println(stack[i]);
        }
        return"-----------------------";
    }
}

