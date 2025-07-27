class Linkedlist
{
    Node head;
    Linkedlist()
    {
        head = null;
    }
    class Node 
    {
        Node prev;
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert_at_last(int d)
    {
        Node newnode = new Node(d);
        if(head == null)
        {
            head = newnode;
        }
        else 
        {
            Node temp = head;
            for( ; temp.next != head; temp = temp.next);
            temp.next = newnode;
        }
            newnode.next = head;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("MT");
        }
        else 
        {
            Node temp = head;
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp!=head);
        }
    }
    public void safe_position()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else 
        {
            Node r = head, t = head;
            for( ; t!=r.next.next ; )
            {
                r = r.next.next;
                t.next = r;
                t = r;
            }
            System.out.println("\nsafe position: "  + t.data);
        }
    }
}

public class LinkedList
{
	public static void main(String[] args) 
	{
	    Linkedlist l = new Linkedlist();
	    int n = 20;
	    for(int i = 1; i<=n; i++)
	    {
	        l.insert_at_last(i);
	    }
	    l.display();
	    
	    l.safe_position();
// 		System.out.println("Hello World");
	}
}
