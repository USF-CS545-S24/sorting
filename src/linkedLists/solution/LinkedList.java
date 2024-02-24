package linkedLists.solution;

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
	 */
	public LinkedList mergeSortedLists(LinkedList list2) {
		LinkedList res = new LinkedList();
		Node curr1 = this.head;
		Node curr2 = list2.head;
		while (curr1 != null && curr2 != null) {
			if (curr1.getElem() <= curr2.getElem()) {
				res.append(curr1.getElem());
				curr1 = curr1.next();
			}
			else {
				res.append(curr2.getElem());
				curr2 = curr2.next();
			}
		}
		if (curr1 == null) {
			while (curr2 != null) {
				res.append(curr2.getElem());
				curr2 = curr2.next();
			}
		} else {
			while (curr1 != null) {
				res.append(curr1.getElem());
				curr1 = curr1.next();
			}
		}

		return res;
	}

	// Additional problem if there is time - remove all repeated elements
	// from this linked list; assume the linked list is sorted.
	public void removeDuplicatesFromSortedLinkedList() {
		Node prev = null;
		Node curr = head;

		while (curr != null) {
			boolean foundDup = false;
			// The while loop below will be going over duplicate values
			while ((curr != null && curr.next() != null) && (curr.getElem() == curr.next().getElem())) {
				curr = curr.next();
				foundDup = true;
			}
			if (foundDup) {
				if (prev != null && (prev.next() != head)) {
					curr = curr.next();
					prev.setNext(curr); // skip numbers that are repeated
				}
				else { // duplicates at the head
					head = curr.next();
				}
				// Handle cases when we need to update the tail
				if (curr == null)
					tail = prev;
				else
					if (curr.next() == null) {
						tail = curr;
					}
			}
			else {
				if (curr != null) { // go forward (move prev, curr)
					prev = curr;
					curr = curr.next();
				}
			}
		}
	}



	public static void main(String[] args) {
		/*LinkedList list1 = new LinkedList();
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
		result.printNodes();
		*/

		System.out.println("Before removing repeated elements: ");
		LinkedList list3 = new LinkedList();
		list3.append(3);
		list3.append(3);
		list3.append(5);
		list3.append(5);
		list3.append(5);
		list3.append(7);
		list3.append(8);
		list3.append(8);
		list3.append(9);
		list3.append(10);
		list3.append(10);
		list3.append(10);
		list3.append(10);
		list3.append(11);
		list3.printNodes();
		list3.removeDuplicatesFromSortedLinkedList();
		System.out.println("After: ");
		list3.printNodes();
		if (list3.head != null)
			System.out.println("head = " + list3.head.getElem() + ", tail = " + list3.tail.getElem());
		System.out.println();
	}

}
