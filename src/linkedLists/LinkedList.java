package linkedLists;

/** A class representing a linked list. */
public class LinkedList {
	private Node head, tail;

	/** Constructor */
	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
	 * Creates a new node with the given element and adds it to the back of the
	 * list
	 */
	public void append(int elem) {
		Node newNode = new Node(elem);
		if (tail != null) {
			tail.setNext(newNode);
			tail = newNode;
		} else {
			head = tail = newNode;
		}

	}

	/** Prints all the nodes in the link list */
	public void printNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getElem() + " ");
			current = current.next();
		}
		System.out.println();
	}


	/**
	 * Merge this sorted linked list with a given sorted linked list into a single sorted linked list.
	 *
	 * @param list2
	 * Your method should not destroy the original list and its nodes should *not* reference
	 * the nodes in the input list (you need to create new nodes instead).
	 * Example:
	 * this:  1->3->7
	 * list2: 2->4->10->15
	 * result: 1->2->3->4->7->10->15
	 */
	public LinkedList mergeSortedLists(LinkedList list2) {
		LinkedList res = new LinkedList();
		Node curr1 = this.head;
		Node curr2 = list2.head;
		// FILL IN CODE

		return res;
	}

	// Additional problem if there is time

	/**
	 * Remove repeated elements from the sorted linked list.
	 * Example:
	 * this:  3->5->5->5->7->8->8->9
	 * after removing repeated elements: 3->7->9
	 * Note: in this version, we do not keep even a single copy of the repeated element.
	 */
	public void removeDuplicatesFromSortedLinkedList() {
		Node prev = null;
		Node curr = head;
		// FILL IN CODE

	}



	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.append(5);
		list1.append(6);
		list1.append(8);
		list1.append(13);
		list1.printNodes();

		LinkedList list2 = new LinkedList();
		list2.append(1);
		list2.append(7);
		list2.append(25);
		list2.append(50);
		list2.append(55);
		list2.printNodes();

		LinkedList result = list1.mergeSortedLists(list2);
		System.out.println("After merging sorted linked lists: ");
		result.printNodes();

		/*
		LinkedList list3 = new LinkedList();
		list3.append(3);
		list3.append(3);
		list3.append(5);
		list3.append(5);
		list3.append(5);
		list3.append(7);
		list3.append(8);
		list3.append(8);

		list3.printNodes();
		list3.removeDuplicatesFromSortedLinkedList();
		list3.printNodes();
		System.out.println(list3.head.getElem() + " " + list3.tail.getElem());
		*/
	}

}
