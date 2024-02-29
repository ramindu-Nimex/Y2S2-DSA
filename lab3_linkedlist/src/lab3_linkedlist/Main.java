package lab3_linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		
        linkList.insertFirst("Prashani", 69.5);
        linkList.insertFirst("Aravinda", 78.0);
        linkList.insertFirst("Nipuna", 53.5);
        
        linkList.displayList();
        System.out.println();
        
        linkList.insertFirst("John", 85.5);
        linkList.insertFirst("Jane", 92.0);

        linkList.displayList();
        System.out.println();
        
        linkList.deleteLink("Aravinda");
        linkList.displayList();
	}
}
