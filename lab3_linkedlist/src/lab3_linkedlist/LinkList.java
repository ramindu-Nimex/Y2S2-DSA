package lab3_linkedlist;

public class LinkList {

private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(String name, double average) {
		Link newLink = new Link(name, average);
		newLink.next = first;
		first = newLink;
	}
	
	public void displayList() {
		Link cur = first;
		while(cur != null) {
			cur.displayDetails();
			cur = cur.next;
		}
	}
	
	public Link deleteFirst() {
		Link temp = first;
		temp.next = first;
		return temp;
	}
	
	public Link deleteLink(String name) {
		Link cur = first;
		Link prev = first;
		
		if(cur == null) {
			return null;
		}
		
		while(!cur.name.equals(name)) {
			prev = cur;
			cur = cur.next;
			
			if(cur == null) {
				return null;
			}
		}
		
		if(cur == first) {
			first = first.next;
		} else {
			prev.next = cur.next;
		}
		return cur;
	}
}
