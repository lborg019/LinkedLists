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
    Scanner scan = new Scanner(System.in);
    
    public void runMenu()
    {
        //Scanner scan = new Scanner(System.in);
        int choice;
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
            System.out.println("Reservations menu:");
            System.out.println("1) Make new reservation");
            System.out.println("2) Change reservation");
            System.out.println("3) Remove reservation");
            System.out.println("4) View reservations");
            System.out.println("5) Back");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            
            switch(choice)
            {
                case 1: //add data
                    uInfo.loadInfo(); //validates and loads user info
                    //adds this user info to list
                    rList.add(new ReservationInfo(rList.size()+1, uInfo.uName,
                                                  uInfo.uDate, uInfo.uTime));
                    
                    //not sure rList.size()+1 is really necessary
                    break;
                    
                case 2: //change data
                    changeReservations();
                    
                    break;
                    
                case 3: //remove
                    removeReservations();
                    
                    break;
                    
                case 4: //view
                    displayReservations();
                    break;
                    
                default:
                    break;
            }
            
        }
        while(choice != 5);
    }
    
    public void displayReservations()
    {
        if(rList.isEmpty() == false)
        {
            System.out.println("Reservations total: " + rList.size());
            for (int i = 0; i < rList.size(); i++)
            {
                System.out.println( "Reservation #: " + (i+1)
                                  + "\nName: " + rList.get(i).rName
                                  + "\nDate: " + rList.get(i).rDate
                                  + "\nTime: " + rList.get(i).rTime
                                  + "\n");
            }
        }
        else
        {
            System.out.println("List is empty!");
        }
    }
    
    public void removeReservations()
    {
        displayReservations();
        if(rList.isEmpty() == false)
        {
            System.out.println("Type index of reservation to be removed:");
            int removeIndex = scan.nextInt();  //get index
            rList.remove(removeIndex - 1);     //remove it
            displayReservations();             //display it again
        }
    }
    
    public void changeReservations()
    {
        displayReservations();
        if(rList.isEmpty() == false)
        {
            System.out.println("Type index of reservation to be changed:");
            int changeIndex = scan.nextInt();   //get index
            changeIndex  = changeIndex - 1;
            uInfo.loadInfo();                   //load/val user info
            rList.get(changeIndex).setrName(uInfo.uName); //set new name
            rList.get(changeIndex).setrDate(uInfo.uDate); //set new date
            rList.get(changeIndex).setrTime(uInfo.uTime); //set new time
        }
    }
}
