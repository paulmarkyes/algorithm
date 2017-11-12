package algorithms;

import java.util.HashMap;
import java.util.Hashtable;

public class LinkList_Test_1 {
	Node head=null;
	public static void main(String[] args) {
		LinkList_Test_1 link =  new LinkList_Test_1();
		link.addNum(1);
		link.addNum(2);
		link.addNum(3);
		link.addNum(4);
		link.addNum(5);
		link.printNum();
		System.out.println("--------------------------------");
		link.reverse();
		link.printNum();

		
	}
	public void addNum(int data) {
		Node node = new Node(data);
		
		if(head==null)
		{
			head=node;
			return;
		}

		Node tmp = head;
		while(tmp.next!=null)
		{
			tmp=tmp.next;
		}
		tmp.next=node;
		
	}
	public void printNum() {
		
		Node tmp = head;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	public void reverse() {
		Node pReversedHead=head;
		Node pNode = head;
		Node pPrev = null;
		while(pNode!=null)
		{
			Node pNext = pNode.next;
			if(pNext==null)
			{
				pReversedHead=pNode;
			}
			pNode.next=pPrev;
			pPrev=pNode;
			pNode=pNext;
		}
		this.head=pReversedHead;
		
	}
	

}
class Node
{
	int data;
	Node next=null;
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}


}
