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
public class Node
{

    public ReservationInfo rObject; //data
    public Node nextNode;           //pointer to next node
    
    public Node(ReservationInfo reservation)
    {
        rObject = reservation;
    }
    
    public void printNodeElements()
    {
        System.out.println("Elements are: " + rObject.getrName()
                                            + rObject.getrDate()
                                            + rObject.getrTime()
        );
    }
}
