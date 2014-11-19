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

class LinkedLists
{
    Node head;
    Node tail;
    
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
        
        public boolean hasNext()
        {
            if(position == null)
            {
                if(head == null) //linked list is empty
                {
                    return false;
                }
                return true;
            }
            
            if(position.nextNode == null)
            {
                return false;
            }
            else
            return true;
        }
        
        public void next()
        {
        
        }
        
        public void add()
        {}
        
        public void remove()
        {}
        
        //public void reset/isEmpty
    }
    
    class Node
    {
        //Every node in the linked list must contain both data and pointer
        public ReservationInfo rObject; //data
        public Node nextNode;           //pointer to next node

        public Node(ReservationInfo reservation, Node n)
        {
            rObject = reservation;
            nextNode = n;
        }

        public boolean isEmpty()
        {
            return false;
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

        public void printNodeElements()
        {
            System.out.println("Elements are: " + rObject.getrName()
                                                + rObject.getrDate()
                                                + rObject.getrTime()
            );
        }
    }
}