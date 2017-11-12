package algorithms;

import java.security.acl.LastOwnerException;

//队列先进先出
public class Cycle_Queue_1<Key> {
	Queue_Node<Key> first;
	Queue_Node<Key> last;
	int N;
	public boolean isempty() {
		return N==0;
	}
	public int size() {
		return N;
		
	}
	//添加队列
	public void enqueue(Key key) {
		Queue_Node<Key> queue = new Queue_Node<Key>(key);
		if(isempty())
		{
			last = queue;
			first=last;
			last.next=null;
			N++;
			return;
		}
		Queue_Node<Key> tmp = last;
		last = queue;
		tmp.next=last;
		N++;
	}
	public void removeAfter(Key key) {
		if(key==null) return;
		Queue_Node<Key> tmp = first;
		while(tmp!=null)
		{
			if(tmp.key.equals(key))
			{
				tmp.next=null;
				return;
			}
			tmp=tmp.next;
		}
		
	}
	//接受一个链表和一个字符串key作为参数，删除所以和key相同的节点
	public void prints() {
		Queue_Node<Key> tmp = first;
		while(tmp!=null)
		{
			System.out.println(tmp.key);
			tmp=tmp.next;
		}
		
	}
	public static void main(String[] args) {
		Cycle_Queue_1<String> cqueue = new Cycle_Queue_1<>();
		cqueue.enqueue("1");
		cqueue.enqueue("2");
		cqueue.enqueue("3");
		cqueue.enqueue("4");
		cqueue.removeAfter("2");
		cqueue.prints();
	}
	
}
