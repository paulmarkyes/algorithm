package algorithms;


public class LinkList_Test_2 {
	public static void main(String[] args) {
		Node_1 head = new Node_1(0);
		Node_1 node1 = new Node_1(1);
		Node_1 node2 = new Node_1(2);
		Node_1 node3 = new Node_1(3);
		Node_1 node4 = new Node_1(4);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);

		// 打印反转前的链表
		Node_1 h = head;
		while (null != h) {
			System.out.print(h.getData() + " ");
			h = h.getNext();
		}
		// 调用反转方法
		head = Reverse1(head);

		System.out.println("\n**************************");
		// 打印反转后的结果
		while (null != head) {
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}
	}

	/**
	 * 递归，在反转当前节点之前先反转后续节点
	 */
	public static Node_1 Reverse1(Node_1 head) {
		// head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
		if (head == null || head.getNext() == null) {
			return head;// 若为空链或者当前结点在尾结点，则直接还回
		}
		Node_1 reHead = Reverse1(head.getNext());// 先反转后续节点head.getNext()
		head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
		head.setNext(null);// 前一结点的指针域令为null;
		//System.out.println(head.getData());
		return reHead;// 反转后新链表的头结点
	}
}

	class Node_1 {
		private int Data;// 数据域
		private Node_1 Next;// 指针域

		public Node_1(int Data) {
			// super();
			this.Data = Data;
		}

		public int getData() {
			return Data;
		}

		public void setData(int Data) {
			this.Data = Data;
		}

		public Node_1 getNext() {
			return Next;
		}

		public void setNext(Node_1 Next) {
			this.Next = Next;
		}
	}