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

    public UserInfo(int uNumber, String uName, String uDate, String uTime)
    {        
        this.uNumber = uNumber;
        this.uName = uName;
        this.uDate = uDate;
        this.uTime = uTime;
    }
    
    public void loadInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in your name");
        setuName(scanner.nextLine());
        System.out.println("Please type in the reservation date");
        setuDate(scanner.nextLine());
        System.out.println("Please type in the reservation"
                           + " time (continuous format)");
        setuTime(scanner.nextLine());
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
