/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author Lukas
 * 
 * This class gets the user input
 */

import java.util.Scanner;
import java.io.*;

public class UserInfo
{
    int uNumber;
    String uName;
    String uDate;
    String uTime;
    
    public UserInfo()
    {
        
    }

    public UserInfo(String uName, String uDate, String uTime)
    {        
        //this.uNumber = uNumber;
        this.uName = uName;
        this.uDate = uDate;
        this.uTime = uTime;
    }
    
    //check if date is okay
    public boolean checkDate(String date)
    {
        //date follows mm/dd/yyyy format;
        //fail validation test if:
        //-> less than 10 characters are entered;
        //-> slashes are placed incorrectly
        //-> day > 31
        //-> month > 12
        // no checks for months with 30 or 31 days
        
        int day = Integer.parseInt(date.substring(0,2));
        int month = Integer.parseInt(date.substring(3,5));
        
        if(date.charAt(2) != '/' && date.charAt(4) != '/'
           || date.length() != 10 || day > 12 || month > 31)
        {
            return false; //fails
        }
        else
        {
            return true; //succeeds
        }
    }
    
    //check if time is okay
    public boolean checkTime(String time)
    {
        //time follows hh:mm format;
        //fail validation test if:
        //-> less than 5 characters are entered;
        //-> : are placed incorrectly
        //-> hh > 24
        //-> mm > 59
        
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));
        
        if(time.charAt(2) != ':' || time.length() != 5
           || hours > 24 || minutes > 50)
        {
            return false; //fails
        }
        else
        {
            return true; //succeeds
        }
    }
    
    public void loadInfo()
    {
        String tempDate;
        String tempTime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in your name:");
        setuName(scanner.nextLine());
        
        System.out.println("Please type in the reservation date [mm/dd/yyyy]:");
        tempDate = scanner.nextLine();
        while(checkDate(tempDate) == false) //input validation loop
        {
            System.out.println("Invalid date.");
            System.out.println("Please type the reservation date [mm/dd/yyyy]");
            tempDate = scanner.nextLine();
        }
        setuDate(tempDate); //sets validated date
        
        
        System.out.println("Please type in the reservation"
                             + " time [hh:mm continuous format]:");
        tempTime = scanner.nextLine();
        while(checkTime(tempTime) == false) //input validation:
        {
            System.out.println("Invalid time.");
            System.out.println("Please type the reservation time [hh:mm continous])");
            tempTime = scanner.nextLine();
        }
        setuTime(tempTime); //sets validated continous time
    }
    
    //Getters
    public int getuNumber() { return uNumber; }
    public String getuName(){ return uName;   }
    public String getuDate(){ return uDate;   }
    public String getuTime(){ return uTime;   }
    
    //Setters
    public void setuNumber(int rNumber){ this.uNumber = rNumber; }    
    public void setuName(String rName){ this.uName    = rName;   }
    public void setuDate(String rDate){ this.uDate    = rDate;   }
    public void setuTime(String rTime){ this.uTime    = rTime;   }
    
}
