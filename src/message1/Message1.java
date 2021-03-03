/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message1;

import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Message1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in);
        Scanner formessage = new Scanner(System.in);
        Queue que = new Queue();
        Stack sta = new Stack();
        boolean end = false;
        while (end == false) {
            System.out.println("1. Nhập message");
            System.out.println("2.show all message");
            System.out.println("3. thoát");
            int choice = sca.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a message");
                    String Message;
                    Message = formessage.nextLine();
                    que.enqueue(Message);
                    que.dequeue();
                    break;
                case 2:
                    System.out.println("-------------");
                    System.out.println("all message");
                    System.out.println("-------------");
                    que.displaystack();
                    System.out.println("--------------");

                    break;
                case 3:
                    end = true;
                    break;
                default:
                    break;
            }

        }

        /* //start
        System.out.println("enter a message");
        String Message =   sca.next();
        que.enqueue(Message);
        System.out.println("display in queue");
       que.display();
        System.out.println("The Message is:");
        que.dequeue();*/
    }

}
