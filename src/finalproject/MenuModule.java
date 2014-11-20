/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author Owner
 * 
 * This class runs the menu module
 */

import java.util.Scanner;
import java.io.*;

public class MenuModule
{
    //LinkedLists list = new LinkedLists();
    rLinkedList rList = new rLinkedList();
    UserInfo    uInfo = new UserInfo();
    
    public void runMenu()
    {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("Luigi's Restaurant");
            System.out.println("Please choose your options:");
            System.out.println("1) Reservations");
            System.out.println("2) Walk-ins");
            System.out.println("3) Quit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    runReservations();
                    
                break;
                    
                case 2:
                    runQueue();
                break;
                    
                case 3:
                    System.out.println("Thank you!");
                break;
                    
                default:
                    System.out.println("Invalid option");
                break;
            }
        }
        while(choice != 3);
        
    }
    
    public void runQueue()
    {
        int choice;
        do
        {
            System.out.println("Walk-ins:");
            System.out.println("1) Enqueue a client");
            System.out.println("2) Dequeue a client");
            System.out.println("3) View queue");
            System.out.println("4) Back");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
        }
        while(choice != 4);
    }
    
    public void runReservations()
    {
        int choice;
        
        do
        {
            System.out.println("Reservations:");
            System.out.println("1) Make new reservation");
            System.out.println("2) Change reservation");
            System.out.println("3) Remove reservation");
            System.out.println("4) View reservations");
            System.out.println("5) Back");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            
            switch(choice)
            {
                case 1:
                    
                    uInfo.loadInfo();
                    rList.add(new ReservationInfo(rList.size()+1, uInfo.uName,
                                                  uInfo.uDate, uInfo.uTime));
                    //not sure rList.size()+1 is really necessary
                    
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    System.out.println(uInfo.uName + " " + uInfo.uDate + " " + uInfo.uTime);
                    System.out.println(rList.size());
                    break;
                    
                default:
                    break;
            }
            
        }
        while(choice != 5);
    }
}
