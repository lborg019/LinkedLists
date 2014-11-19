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
    Node nextNode;           //reference to next node in chain. null if none
    ReservationInfo rObject; //data carried by this node

    public Node(ReservationInfo reservation)
    {
        nextNode = null;
        rObject = reservation;
    }
    
    //Getters
    public Node getNextNode()          {  return nextNode;    }
    public ReservationInfo getrObject(){   return rObject; }

    //Setters
    public void setrObject(ReservationInfo rObject){    this.rObject = rObject;}
    public void setNextNode(Node nextNode){ this.nextNode = nextNode; }
    
    @Override
    public String toString()
    {
        return "Node{" + "nextNode=" + nextNode + ", rObject=" + rObject + '}';
    }
    
//    public void printNodeElements()
//    {
//        System.out.println("Elements are: " + rObject.getrName()
//                                            + rObject.getrDate()
//                                            + rObject.getrTime()
//        );
//    }
}
