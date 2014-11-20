/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author Lukas Borges
 */

public class LinkedLists
{
    
}
    
class rLinkedList
{
    //reference to head node:
    private Node head;
    private int listCount;
    
    //private Node tail; ?
    
    //default constructor
    public rLinkedList()
    {
        //this is an empty list, so the reference to the head mode
        //is set to a new node with no data
        head = new Node(null);
        listCount = 0;
        
        //tail = new Node(next);?
    }
    
    //append object to the end of the list
    public void add(ReservationInfo reservation)
    {
        Node listTemp = new Node(reservation);
        Node listCurrent = head;
        
        //starting at the head node, crawl to the end of the list
        while(listCurrent.getNextNode() != null)
        {
            listCurrent = listCurrent.getNextNode();
        }
        
        listCurrent.setNextNode(listTemp);
        listCount++;
    }
    
    //removes element at specified position
    public boolean remove(int index)
    {
        //exit if index > range
        if(index < 1 || index > size()) return false;
        
        Node listCurrent = head;
        for (int i = 1; i < index; i++)
        {
            if(listCurrent.getNextNode() == null) return false;
        }
        listCurrent = listCurrent.getNextNode();
        //connects current Node with succeding Node
        listCurrent.setNextNode(listCurrent.getNextNode().getNextNode());
        listCount--;
        return true;
    }
    
    //returns the amount of nodes in the list
    public int size()
    {
        return listCount;
    }
    
    @Override
    public String toString()
    {
        Node listCurrent = head.getNextNode();
        String output = "";
        while(listCurrent != null)
        {
            output += "[" + listCurrent.getrObject().toString() + "]";
            listCurrent = listCurrent.getNextNode();
        }
        return output;
    }
    
}

//This class defines the linked
//list iterator, used to insert
//nodes in the correct position
class LinkedListIterator
{
    //3 instance variables
    Node position;
    Node previous;
    boolean isAfterNext;

    public LinkedListIterator()
    {
        position = null;
        previous = null;
        isAfterNext = false;
    }
}    

//This class defines each node object 
//which are composed of pointer and data.
class Node
{
    Node nextNode;           //reference to next node in chain. null if none
    ReservationInfo rObject; //data carried by this node

    //Default Constructor
    public Node(ReservationInfo reservation)
    {
        nextNode = null;
        rObject = reservation;
    }

    //another Node constructor if we want to
    //specify the node to point to.
    public Node(ReservationInfo reservation, Node next)
    {
        nextNode = next;
        rObject = reservation;
    }

    //Getters
    public ReservationInfo getrObject(){return rObject;  }
    public Node getNextNode()          {return nextNode; }

    //Setters
    public void setrObject(ReservationInfo rObject){this.rObject = rObject;  }
    public void setNextNode(Node nextNode)         {this.nextNode = nextNode;}

}

    //    public void enqueue(ReservationInfo r)
//    {
//        if(rear != null)
//        {
//            rear.next = new Node(r, null);
//            rear = near.next;
//        }
//        else
//        {
//            rear = new Node(r, null);
//            //finish implementing
//        }
//    }

//    public String dequeue()
//    {
//        if(empty())
//            throw new IllegalStateException();
//        else
//        {
//            String value = front.element;
//            front = front.next;
//            if(front == null)
//                rear = null;
//            return value;
//        }
//    }
//        public boolean hasNext()
//        {
//            if(position == null)
//            {
//                if(head == null) //linked list is empty
//                {
//                    return false;
//                }
//                return true;
//            }
//            
//            if(position.nextNode == null)
//            {
//                return false;
//            }
//            else
//            return true;
//        }