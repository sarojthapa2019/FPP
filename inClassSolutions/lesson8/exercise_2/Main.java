package lesson8.exercise_2;

public class Main {

	public static void main(String[] args) {
		//Single-node list
		Node startNode = new Node();
		startNode.data = "A";
		//System.out.println(startNode);
		
		//Two-node list
		Node next = new Node();
		next.data = "B";
		startNode.next = next;
		//System.out.println(startNode);
		
		//Three-node list
		next = new Node();
		next.data = "C";
		startNode.next.next = next;
		System.out.println(startNode);
		
		//Remove B
		Node b = startNode.next;		
		     //then change link from startNode so it points to c
		Node c = startNode.next.next;
		startNode.next = c;
		b = null;
		System.out.println(startNode);
		
		//Insert X into position 1
		Node pos1 = startNode.next;
		Node x = new Node();
		x.data = "X";
		x.next = pos1;
		startNode.next = x;
		System.out.println(startNode);

	}

}
