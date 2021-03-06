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
    LinkedList     rList  = new LinkedList();
    UserInfo       uInfo  = new UserInfo(null, null);
    Scanner         scan  = new Scanner(System.in);
    ListIterator iterator = rList.listIterator();
    
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
                    iterator.makeNewReservation(new ReservationInfo(uInfo.uName, uInfo.uTime));
                    
                    break;
                    
                case 2: //change data
                    changeReservation();
                    
                    break;
                    
                case 3: //remove
                    removeReservation();
                    
                    break;
                    
                case 4: //view
                    displayReservation();
                    break;
                    
                default:
                    break;
            }
            
        }
        while(choice != 5);
    }
    
    public void displayReservation()
    {
        System.out.println("Reservations total: " + rList.size());
        if(rList.isEmpty() == false)
        {
            for (int i = 0; i < rList.size(); i++)
            {
                System.out.println( "Reservation #: " + (i+1)
                                  + "\nName: " + rList.get(i).rName
                                  + "\nTime: " + rList.get(i).rTime
                                  + "\n");
            }
        }
        else
        {
            System.out.println("List is empty!");
        }
    }
    
    public void removeReservation()
    {
        displayReservation();
        if(rList.isEmpty() == false)
        {
            System.out.println("Type index of reservation to be removed:");
            int removeIndex = scan.nextInt();  //get index
            rList.removeIndex(removeIndex);    //remove it
            displayReservation();             //display it again
        }
    }
    
    public void changeReservation()
    {
        displayReservation();
        if(rList.isEmpty() == false)
        {
            System.out.println("Type index of reservation to be changed:");
            int changeIndex = scan.nextInt();   //get index
            rList.removeIndex(changeIndex);
            uInfo.loadInfo();                             //load/val user info
            iterator.makeNewReservation(new ReservationInfo(uInfo.uName, uInfo.uTime));
        }
    }
}
