package eva2.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		
		Lista l = new Lista();
		for(int i = 0; i <= 10; i++){
			l.addStart((int)(Math.random()*80)-40);
		}

		l.printList();
		
		System.out.println("-------------------------------");
		try {
			System.out.println(l.getByIndex(11).toString());
		} catch (NullPointerException e) {
			System.out.println("Null node...");
		}
		
		System.out.println("-------------------------------");

		l.addEnd(-1);
		
		try {
			System.out.println(l.getByIndex(11).toString());
		} catch (Exception e) {
			System.out.println("Null node...");
		}
		System.out.println("-------------------------------");
		
		System.out.println("Linked list length = " + l.length());
		
		System.out.println("-------------------------------");
		
		l.addByIndex(1, 666);
		l.printList();
		
		System.out.println("-------------------------------");
		
		l.removeFirst();
		System.out.println(l.getByIndex(0).toString());
		
		System.out.println("-------------------------------");
		
		l.removeFirst();
		l.addStart(10);
		l.removeLast();
		l.removeLast();
		l.printList();
		
		System.out.println("-------------------------------");
		
		l.removeByIndex(0);
		l.removeByIndex(l.length() - 1);
		l.removeByIndex(3);
		l.printList();
		
		System.out.println("-------------------------------");
		
		/*int length = l.length();
		
		for(int i = 0; i < length; i++){
			l.removeByIndex(1);
		}
		l.printList();*/
		
		l.sortByInfo();
		l.printList();
		
		System.out.println("-------------------------------");
		
		l.addByIndex(l.length(), 11);
		l.addByIndex(l.length(), 10);
		l.addByIndex(l.length(), 10);
		
		l.printList();
		System.out.println("------------------");
		l.removeByInfo(11);
		l.printList();
		
		System.out.println("-------------------------------");
		
		l.sortByInfo();
		l.addSortedAsc(1);
		l.addSortedAsc(2);
		l.addSortedAsc(3);
		l.addSortedAsc(4);
		l.addSortedAsc(5);
		l.addSortedAsc(-10002);
		l.addSortedAsc(10002);
		l.printList();
	}

}
