package linkedlist;

import linkedlist.intersection.Node;

public class rotate
{
static Node head; 
 
public static class Node
 {
     int data;
     Node next;
     Node(int d)
     {
         data = d;
         next = null;
     }
 }

 void rotate(int k)
 {
     if (k == 0) return;

     Node current  = head;

     int count = 1;
     while (count < k && current !=  null)
     {
         current = current.next;
         count++;
     }

     if (current == null)
         return;
     Node kthNode = current;

     while (current.next != null)
         current = current.next;

     current.next = head;

     head = kthNode.next;

     kthNode.next = null;

 }

 void display()
 {
     Node temp = head;
     while(temp != null)
     {
         System.out.print(temp.data+" ");
         temp = temp.next;
     }
     System.out.println();
 }

 public static void main(String args[])
 {
     rotate llist = new rotate();

     llist.head = new Node(1);
     llist.head.next = new Node(2);
     llist.head.next.next = new Node(3);
     llist.head.next.next.next = new Node(4);
     llist.head.next.next.next.next = new Node(5);

     llist.rotate(4);

     System.out.println("Rotated Linked List");
     llist.display();
 }
}