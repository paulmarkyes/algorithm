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

		// ��ӡ��תǰ������
		Node_1 h = head;
		while (null != h) {
			System.out.print(h.getData() + " ");
			h = h.getNext();
		}
		// ���÷�ת����
		head = Reverse1(head);

		System.out.println("\n**************************");
		// ��ӡ��ת��Ľ��
		while (null != head) {
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}
	}

	/**
	 * �ݹ飬�ڷ�ת��ǰ�ڵ�֮ǰ�ȷ�ת�����ڵ�
	 */
	public static Node_1 Reverse1(Node_1 head) {
		// head������ǰһ��㣬head.getNext()�ǵ�ǰ��㣬reHead�Ƿ�ת���������ͷ���
		if (head == null || head.getNext() == null) {
			return head;// ��Ϊ�������ߵ�ǰ�����β��㣬��ֱ�ӻ���
		}
		Node_1 reHead = Reverse1(head.getNext());// �ȷ�ת�����ڵ�head.getNext()
		head.getNext().setNext(head);// ����ǰ����ָ����ָ��ǰһ���
		head.setNext(null);// ǰһ����ָ������Ϊnull;
		//System.out.println(head.getData());
		return reHead;// ��ת���������ͷ���
	}
}

	class Node_1 {
		private int Data;// ������
		private Node_1 Next;// ָ����

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