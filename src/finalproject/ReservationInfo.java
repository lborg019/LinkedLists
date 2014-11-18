/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author Owner
 */
public class ReservationInfo
{

    int rNumber;
    String rName;
    String rDate;
    String rTime;
    
    public ReservationInfo()
    {
        
    }

    public ReservationInfo(int rNumber, String rName, String rDate, String rTime)
    {
        this.rNumber = rNumber;
        this.rName = rName;
        this.rDate = rDate;
        this.rTime = rTime;
    }
    
    //Getters
    public int getrNumber() { return rNumber; }
    public String getrName(){ return rName;   }
    public String getrDate(){ return rDate;   }
    public String getrTime(){ return rTime;   }
    
    //Setters
    public void setrNumber(int rNumber){ this.rNumber = rNumber; }
    public void setrName(String rName){ this.rName    = rName;   }
    public void setrDate(String rDate){ this.rDate    = rDate;   }
    public void setrTime(String rTime){ this.rTime    = rTime;   }    
}
