public class Stack{
	Node top;
	Node pop()
	{
		if(top!=null)
		{
			Node re=top;
			top=top.next;
			return re;
		}
		return null;
	}
	
	void push(int item){
		Node t=new Node(item);
		t.next=top;
		top=t;
	}
	
	@Override
	public  String toString()
	{
		String re="top";
		Node n=top;
		while(n!=null)
		{
			re+="-->"+n.data;
			n=n.next;	
		}
		return re;
	}
	
	public static void main(String[] args)
	{
		Node t = new Node(1);
		
		
		Stack s=new Stack();
		s.top=t;
		s.push(2);
		s.push(3);
		System.out.println(s.toString());
		s.pop();
	
		System.out.println(s.toString());
		
		s.push(4);
		s.push(5);
		
		System.out.println(s.toString());
	}
}


class Node 
{
	Node next = null;
	int data;

	public Node(int d) 
	{
		data = d;
	}

	void appendToTail(int d) 
	{
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
			n = n.next;
		n.next = end;
	}

	Node deleteNode(Node head, int d)
	{
		Node n = head;
		if (n.data == d) {
			return head.next;
		}

		while (n.next != null)
		{
			if (n.next.data == d) 
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
}

/*
 * top-->3-->2-->1
top-->2-->1
top-->5-->4-->2-->1
 */
