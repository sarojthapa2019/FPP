package prob1;


public class MinDoublyLinkedList {

		Node header;
		public MinDoublyLinkedList(){
			header = new Node();
		}
		public void add(String item){
			//implement
			Node newNode = new Node();
			newNode.value = item;
			if(header.next == null) {
				newNode.previous = header;
				newNode.next = null;
				header.next = newNode;
			}else {
				if(item.compareTo(header.next.value) > 0) {
					newNode.previous = header.next;
					newNode.next = header.next.next;
					header.next.next = newNode;
					if(header.next.next!=null) {
						header.next.next.previous = newNode;
					}
				}else {
					newNode.previous = header;
					newNode.next = header.next;
					header.next = newNode;
					header.next.previous = newNode;
				}
			}
			
			

		}
		@Override
		public String toString() {

			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();

		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}

		class Node {
			String value;
			Node next;
			Node previous;

			public String toString() {
				return value == null ? "null" : value;
			}

			public Node(String value, Node next, Node previous){
				this.value = value;
				this.next = next;
				this.previous = previous;
			}

			public Node(){

			}
		}

		public static void main(String[] args){
			MinDoublyLinkedList list = new MinDoublyLinkedList();
			list.add("bob");
			System.out.println(list); //expect:  bob
			list.add("harry");
			System.out.println(list); //expect:  bob harry
			list.add("steve");
			System.out.println(list); //expect:  bob steve harry
			list.add("anne");
			System.out.println(list); //expect:  anne bob steve harry

		}
}
