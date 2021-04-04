package linkedlist;

public class lastNsum {
    static class Node{
        int data;
        Node next;
        Node(int d)
            {
                data=d;
                next=null;
            }
              }
    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    static int sumOfN(Node head,int n)
    {
        if(n<=0)
            return 0;
        head=reverse(head);
        int sum=0;
        Node cur=head;
        while(cur!=null&&n>0)
        {
            sum=sum+cur.data;
            cur=cur.next;
            n--;
        }
        head=reverse(head);
        return sum;
    }
    public static void main(String args[])
    {
    Node head=new Node(1);
    head.next=new Node(8);
    head.next.next=new Node(7);
    head.next.next.next=new Node(5);
    int n=2;
    System.out.print(sumOfN(head, n));
    }
}