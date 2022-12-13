

//import java.util.ArrayList; //Q1Arraylist
//import java.util.Collections;
// 
//public class DataMed {
// 
//    public static void main(String a[])
//    {
// 
//        // Create the Array List
//        ArrayList<String> ArrList = new ArrayList<String>();
// 
//        // add the values in Array List
//        ArrList.add("Item 1");
//        ArrList.add("Item 2");
//        ArrList.add("Item 3");
//        ArrList.add("Item 4");
//        ArrList.add("Item 5");
// 
//        // display Array List before swap
//        System.out.println("Before Swap the ArrayList ");
//        System.out.println(ArrList);
// 
//        // Swapping the elements at 1 and 2 indices
//        Collections.swap(ArrList, 1, 2);
// 
//        // display Array List after swap
//        System.out.println("After Swap the ArrayList");
//        System.out.println(ArrList);
//    }
//}
//----Q2 ArrayList
//public class DataMed {
 
    /* Return true if arr2[] is a subset
    of arr1[] */
//    static boolean isSubList(int arr1[], int arr2[], int m,
//                            int n)
//    {
//        int i = 0;
//        int j = 0;
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < m; j++)
//                if (arr2[i] == arr1[j])
//                    break;
// 
//            /* If the above inner loop
//            was not broken at all then
//            arr2[i] is not present in
//            arr1[] */
//            if (j == m)
//                return false;
//        }
// 
//        /* If we reach here then all
//        elements of arr2[] are present
//        in arr1[] */
//        return true;
//    }
// 
//    // Driver code
//    public static void main(String args[])
//    {
//        int arr1[] = { 1,2,3,4,5,6};
//        int arr2[] = { 2,4,5 };
// 
//        int m = arr1.length;
//        int n = arr2.length;
// 
//        if (isSubList(arr1, arr2, m, n))
//            System.out.print("arr2[] is "
//                             + "subList of arr1[] ");
//        else
//            System.out.print("arr2[] is "
//                             + "not a subList of arr1[]");
//    }
//}
//---Q3 ArrayList
    
//class DataMed {
// 
//    static void palindrome(int arr[], int n)
//    {
//        // Initialise flag to zero.
//        int flag = 0;
// 
//        // Loop till array size n/2.
//        for (int i = 0; i <= n / 2 && n != 0; i++) {
// 
//            // Check if first and last element are different
//            // Then set flag to 1.
//            if (arr[i] != arr[n - i - 1]) {
//                flag = 1;
//                break;
//            }
//        }
// 
//        // If flag is set then print Not Palindrome
//        // else print Palindrome.
//        if (flag == 1)
//            System.out.println("Not Palindrome");
//        else
//            System.out.println("Palindrome");
//    }
// 
//    // Driver code.
//    public static void main(String[] args)
//    {
//        int arr[] = { 3,6,0,6,3};
//        int n = arr.length;
// 
//        palindrome(arr, n);
//    }
//}

//---Q5
//
//---Q6
//import java.util.*;
// 
//public class DataMed {
//    // Driver code
//    public static void main(String[] args) {
//        int arr1[] = {1, 3, 5, 7};
//        int n1 = arr1.length;
// 
//        int arr2[] = {2, 4, 6, 8};
//        int n2 = arr2.length;
// 
//        int arr3[] = new int[n1 + n2];
//        mergeArrays(arr1, arr2, n1, n2, arr3);
// 
//        System.out.println("Array after merging");
//        for (int i=0; i < n1+n2; i++)
//            System.out.print(arr3[i] + " ");
//             
//    }
//     
//    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
//        int i = 0; 
//        int j = 0; 
//        int k = 0; 
//         
//        // traverse the arr1 and insert its element in arr3
//        while(i < n1){  
//         arr3[k++] = arr1[i++];  
//        }  
//         
//        // now traverse arr2 and insert in arr3
//        while(j < n2){  
//         arr3[k++] = arr2[j++];  
//        }  
//         
//        // sort the whole array arr3
//        Arrays.sort(arr3);  
//    }
//}
//----Q1 LINKEDLIST
/* Java program to check if linked list is palindrome
* recursively */
//import java.util.*;
//
//class DataMed {
//	public static void main(String args[])
//	{
//		Node one = new Node(1);
//		Node two = new Node(2);
//		Node three = new Node(3);
//		Node four = new Node(4);
//		Node five = new Node(3);
//		Node six = new Node(2);
//		Node seven = new Node(1);
//		one.ptr = two;
//		two.ptr = three;
//		three.ptr = four;
//		four.ptr = five;
//		five.ptr = six;
//		six.ptr = seven;
//		boolean condition = isPalindrome(one);
//		System.out.println("isPalidrome :" + condition);
//	}
//	static boolean isPalindrome(Node head)
//	{
//
//		Node slow = head;
//		boolean ispalin = true;
//		Stack<Integer> stack = new Stack<Integer>();
//
//		while (slow != null) {
//			stack.push(slow.data);
//			slow = slow.ptr;
//		}
//
//		while (head != null) {
//
//			int i = stack.pop();
//			if (head.data == i) {
//				ispalin = true;
//			}
//			else {
//				ispalin = false;
//				break;
//			}
//			head = head.ptr;
//		}
//		return ispalin;
//	}
//}
//
//class Node {
//	int data;
//	Node ptr;
//	Node(int d)
//	{
//		ptr = null;
//		data = d;
//	}
//}


//---Q2linkedList
//import java.util.LinkedList;
// 
//public class DataMed {
// 
//    public static void main(String[] args) {
//        
//        //create new LinkedList object
//        LinkedList<String> linkedListColors = new LinkedList<String>();
//        
//        //add elements
//        linkedListColors.add("Red");
//        linkedListColors.add("Green");
//        linkedListColors.add("Blue");
//        
//        /*
//         * To check if the LinkedList contains an element, use
//         * the contains method
//         */
//        //this will return true as the linked list contains "Green"
//        System.out.println( linkedListColors.contains("Green") );
//        
//        //this will return false, as the linked list does not contain "Yellow"
//        System.out.println( linkedListColors.contains("Yellow") );
//    }
//}
//---q3 linkedlist
// Swapping two elements in a Linked List in Java

//import java.util.*;
//
//class DataMed{
//	public static void main(String[] args)
//	{
//
//		LinkedList<Integer> ll = new LinkedList<>();
//
//		// Adding elements to Linked List
//		ll.add(10);
//		ll.add(11);
//		ll.add(12);
//		ll.add(13);
//		ll.add(14);
//		ll.add(15);
//
//		// Elements to swap
//		int element1 = 11;
//		int element2 = 14;
//
//		System.out.println("Linked List Before Swapping :-");
//
//		for (int i : ll) {
//			System.out.print(i + " ");
//		}
//
//		// Swapping the elements
//		swap(ll, element1, element2);
//		System.out.println();
//		System.out.println();
//
//		System.out.println("Linked List After Swapping :-");
//
//		for (int i : ll) {
//			System.out.print(i + " ");
//		}
//	}
//
//	// Swap Function
//	public static void swap(LinkedList<Integer> list,
//							int ele1, int ele2)
//	{
//
//		// Getting the positions of the elements
//		int index1 = list.indexOf(ele1);
//		int index2 = list.indexOf(ele2);
//
//		// Returning if the element is not present in the
//		// LinkedList
//		if (index1 == -1 || index2 == -1) {
//			return;
//		}
//
//		// Swapping the elements
//		list.set(index1, ele2);
//		list.set(index2, ele1);
//	}
//}
////---Q4 linkedlist
//public class DataMed {
//    // Java program to sort link list
//// using insertion sort
//public class LinkedlistIS
//{
//	node head;
//	node sorted;
//
//	class node
//	{
//		int val;
//		node next;
//
//		public node(int val)
//		{
//			this.val = val;
//		}
//	}
//
//	void push(int val)
//	{
//		// Allocate node
//		node newnode = new node(val);
//
//		// Link the old list off the
//		// new node
//		newnode.next = head;
//
//		// Move the head to point to
//		// the new node
//		head = newnode;
//	}
//
//	// Function to sort a singly linked list
//	// using insertion sort
//	void insertionSort(node headref)
//	{
//		// Initialize sorted linked list
//		sorted = null;
//		node current = headref;
//
//		// Traverse the given linked list
//		// and insert every node to sorted
//		while (current != null)
//		{
//			// Store next for next iteration
//			node next = current.next;
//
//			// Insert current in sorted linked list
//			sortedInsert(current);
//
//			// Update current
//			current = next;
//		}
//
//		// Update head_ref to point to
//		// sorted linked list
//		head = sorted;
//	}
//
//	/* Function to insert a new_node in a list.
//	Note that this function expects a pointer
//	to head_ref as this can modify the head
//	of the input linked list (similar to push()) */
//	void sortedInsert(node newnode)
//	{
//		// Special case for the head end
//		if (sorted == null ||
//			sorted.val >= newnode.val)
//		{
//			newnode.next = sorted;
//			sorted = newnode;
//		}
//		else
//		{
//			node current = sorted;
//
//			/* Locate the node before the
//			point of insertion */
//			while (current.next != null &&
//				current.next.val < newnode.val)
//			{
//				current = current.next;
//			}
//			newnode.next = current.next;
//			current.next = newnode;
//		}
//	}
//
//	// Function to print linked list
//	void printlist(node head)
//	{
//		while (head != null)
//		{
//			System.out.print(head.val + " ");
//			head = head.next;
//		}
//	}
//}
//	// Driver code
//	public static void main(String[] args)
//	{
//		Linkedlist<> list;
//    list = new Linkedlist<>();
//		list.push(5);
//		list.push(20);
//		list.push(4);
//		list.push(3);
//		list.push(30);
//		System.out.println(
//		"Linked List before Sorting..");
//		list.printlist(list.head);
//		list.insertionSort(list.head);
//		System.out.println(
//		"LinkedList After sorting");
//		list.printlist(list.head);
//	}
//}
// This code is contributed by Rishabh Mahrsee
//----Q5 merge sort
//https://makeinjava.com/merge-two-sorted-singly-linked-lists-java-example-recursive/#:~:text=Algorithm%20or%20recursive%20method%20to%20merge%20two%20sorted,head2.data%20...%206%20return%20mergedList%20%5Bresultant%20linked%20list%5D

//
// public class DataMed{
//
//    private Node sortedMerge(Node head, Node head0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
///* Java program to merge two
//
///* Link list node */
//class Node {
//	int data;
//	Node next;
//	Node(int d)
//	{
//		data = d;
//		next = null;
//	}
//}
//
//class MergeLists {
//	Node head;
//
//	/* Method to insert a node at
//	the end of the linked list */
//	public void addToTheLast(Node node)
//	{
//		if (head == null) {
//			head = node;
//		}
//		else {
//			Node temp = head;
//			while (temp.next != null)
//				temp = temp.next;
//			temp.next = node;
//		}
//	}
//
//	/* Method to print linked list */
//	void printList()
//	{
//		Node temp = head;
//		while (temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//		System.out.println();
//	}
//}
//	// Driver Code
//	public static void main(String args[])
//	{
//	
//		MergeLists llist1 = new MergeLists();
//		MergeLists llist2 = new MergeLists();
//
//		// Node head1 = new Node(5);
//		llist1.addToTheLast(new Node(5));
//		llist1.addToTheLast(new Node(10));
//		llist1.addToTheLast(new Node(15));
//
//		// Node head2 = new Node(2);
//		llist2.addToTheLast(new Node(2));
//		llist2.addToTheLast(new Node(3));
//		llist2.addToTheLast(new Node(20));
//
//		llist1.head = new DataMed().sortedMerge(llist1.head,
//											llist2.head);
//		System.out.println("Merged Linked List is:");
//		llist1.printList();
//	}
//}
//
//class DataMed {
//	/* Takes two lists sorted in
//	increasing order, and splices
//	their nodes together to make
//	one big sorted list which is
//	returned. */
//	Node sortedMerge(Node headA, Node headB)
//	{
//
//		/* a dummy first node to
//		hang the result on */
//		Node dummyNode = new Node(0);
//
//		/* tail points to the
//		last result node */
//		Node tail = dummyNode;
//		while (true) {
//
//			/* if either list runs out,
//			use the other list */
//			if (headA == null) {
//				tail.next = headB;
//				break;
//			}
//			if (headB == null) {
//				tail.next = headA;
//				break;
//			}
//
//			/* Compare the data of the two
//			lists whichever lists' data is
//			smaller, append it into tail and
//			advance the head to the next Node
//			*/
//			if (headA.data <= headB.data) {
//				tail.next = headA;
//				headA = headA.next;
//			}
//			else {
//				tail.next = headB;
//				headB = headB.next;
//			}
//
//			/* Advance the tail */
//			tail = tail.next;
//		}
//		return dummyNode.next;
//	}
//}

// This code is contributed
// by Shubhaw Kumar

 //---Q6

//import java.util.LinkedList;
//public class DataMed {
//    static class Node { 
//        private Node next; 
//        private String data;
//        public Node(String data) {
//            this.data = data;
//        } 
//        public String data() { 
//            return data;
//        }
//        public void setData(String data) { 
//            this.data = data;} public Node next() { 
//                return next; } public void setNext(Node next) { this.next = next; } @Override public String toString() { return this.data; } }
//
//
//       public boolean isCyclic(){ 
//        Node fast = head;
//        Node slow = head; 
//     while(fast!= null && fast.next != null){
//         fast = fast.next.next;
//      slow = slow.next;
//     if(fast == slow ){ return true; 
//     }
//    }
//    return false;
//}
//    public static void main(String args[]) { 
//        LinkedList linkedList = new LinkedList(); 
//        linkedList.appendIntoTail(new LinkedList.Node("101")); 
//        linkedList.appendIntoTail(new LinkedList.Node("201"));
//        linkedList.appendIntoTail(new LinkedList.Node("301"));
//        linkedList.appendIntoTail(new LinkedList.Node("401"));
//        System.out.println("Linked List : " + linkedList); 
//        if(linkedList.isCyclic()){ System.out.println("Linked List is cyclic as it contains cycles or loop"); 
//        }
//        else{ 
//            System.out.println("LinkedList is not cyclic, no loop or cycle found");
//        } } 
// }

//--q1 recursion
// Java program to reverse a string using recursion
//public class DataMed{
//
//
//	/* Function to print reverse of the passed string */
//	void reverse(String str)
//	{
//		if ((str==null)||(str.length() <= 1))
//		System.out.println(str);
//		else
//		{
//			System.out.print(str.charAt(str.length()-1));
//			reverse(str.substring(0,str.length()-1));
//		}
//	}
//
//	/* Driver program to test above function */
//	public static void main(String[] args)
//	{
//		String str = "weaam ghannam";
//		DataMed obj = new DataMed();
//		obj.reverse(str);
//	}
//}

//-------q2 recursive
//public class DataMed{
//    public static boolean isPalindrome(String s, int i){
//    if(i > s.length()/2)
//    {
//      return true ;
//    }
// 
//    return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;
// 
//  }
// 
//  public static void main (String[] args) {
//    String str = "weaam" ;
//    if (isPalindrome(str, 0))
//    { System.out.println("Yes"); }
//    else
//    { System.out.println("No"); }
// 
//  }
//}
//---q3 recursion

//public class DataMed{
// 
//    // Returns index of x if it is present in arr[],
//    // else return -1
//    public static int binarySearch(ArrayList<Integer> arr, int x)
//    {
//        int left = 0, right = arr.size() - 1;
//       
//        while (left <= right)
//        {
//            int mid = left + (right - left) / 2;
//   
//            // Check if x is present at mid
//            if (arr.get(mid) == x)
//                return mid;
//   
//            // If x greater, ignore left half
//            if (arr.get(mid) < x)
//                left = mid + 1;
//   
//            // If x is smaller, ignore right half
//            else
//                right = mid - 1;
//        }
//   
//        // if we reach here, then element was
//        // not present
//        return -1;
//    }
//   
//    // Driver method to test above
//    public static void main(String args[])
//    {
//        BinarySearch ob = new BinarySearch();
//       
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//       
//        arr.add(5);
//        arr.add(10);
//        arr.add(15);
//        arr.add(20);
//        arr.add(25);
//        arr.add(30);
//        arr.add(35);
//       
//        int x = 10;
//       
//        // Printing elements of array list
//        System.out.println("The elements of the arraylist are: "+arr);
//       
//        int result = ob.binarySearch(arr, x);
//       
//        if (result == -1)
//            System.out.println("Element not present");
//       
//        else
//            System.out.println("The Element " + x + " is found at "
//                               + "index " + result);
//    }
//   
//}
//---q4 recursive

//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//  
//// Java program to reverse a queue recursively
//public class DataMed {
//  
//    static Queue<Integer> queue;
//  
//    // Utility function to print the queue
//    static void Print()
//    {
//        while (!queue.isEmpty())
//        {
//            System.out.print(queue.peek() + " ");
//            queue.remove();
//        }
//    }
//  
//// Recurrsive function to reverse the queue
//static Queue<Integer> reverseQueue(Queue<Integer> q)
//{
//    // Base case
//    if (q.isEmpty())
//        return q;
// 
//    // Dequeue current item (from front) 
//    int data = q.peek();
//    q.remove();
// 
//    // Reverse remaining queue 
//    q = reverseQueue(q);
// 
//    // Enqueue current item (to rear) 
//    q.add(data);
//         
//    return q;
//}
//  
//// Driver code
//public static void main(String args[])
//{
//    queue = new LinkedList<Integer>();
//    queue.add(56);
//    queue.add(27);
//    queue.add(30);
//    queue.add(45);
//    queue.add(85);
//    queue.add(92);
//    queue.add(58);
//    queue.add(80);
//    queue.add(90);
//    queue.add(100);
//    queue = reverseQueue(queue);
//    Print();
//}
//}
//------Q5
//import java.util.Stack;
//public class DataMed {
//   static Stack<Character>st=new Stack<>();
//   static void insert(char x){
//       if (st.isEmpty()){
//           st.push(x);
//       }
//       else{
//           char a=st.peek();
//           st.pop();
//           insert(x);
//           st.push(a);
//       }
//   }
//   static void reverse(){
//       if(st.size()>0){
//           char x=st.peek();
//           st.pop();
//           reverse();
//           insert(x);
//       }
//   }
//   public static void main(String args[]){
//       st.add('1');
//       st.add('2');
//       st.add('3'); 
//       st.add('4');
//       System.out.println("stack");
//       System.out.println(st);
//       reverse();
//       System.out.println("stack reverse");
//       System.out.println(st);
//       
//        
//   }
//
//}
//---q6
//import java.io.*;
//import java.util.*;
//public class DataMed{ 
//    
//    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
//    {
//        // Arraylist for storing reversed elements
//        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
//        for (int i = alist.size() - 1; i >= 0; i--) {
// 
//            // Append the elements in reverse order
//            revArrayList.add(alist.get(i));
//        }
// 
//        // Return the reversed arraylist
//        return revArrayList;
//    }
// 
//    // Iterate through all the elements and print
//    public void printElements(ArrayList<Integer> alist)
//    {
//        for (int i = 0; i < alist.size(); i++) {
//            System.out.print(alist.get(i) + " ");
//        }
//    }
//
//
//
//    public static void main(String[] args)
//    {
//        DataMed obj = new DataMed();
// 
//        // Declaring arraylist without any initial size
//        ArrayList<Integer> arrayli = new ArrayList<Integer>();
// 
//        // Appending elements at the end of the list
//        arrayli.add(new Integer(1));
//        arrayli.add(new Integer(2));
//        arrayli.add(new Integer(3));
//        arrayli.add(new Integer(4));
//        System.out.print("Elements before reversing:");
//        obj.printElements(arrayli);
//        arrayli = obj.reverseArrayList(arrayli);
//        System.out.print("\nElements after reversing:");
//        obj.printElements(arrayli);
//    
//}}
//----Q7 in stack
//import java.util.*;
//public class DataMed{ 
//
//static void PrimeFactors(int N)
//{
//    Stack<Integer> st = new Stack<>();
// 
//    int i = 2;
//     
//    while (N != 1)
//    {
//        if (N % i == 0)
//        {
//             
//            // Insert i into stack
//            st.push(i);
// 
//            while (N % i == 0)
//            { 
//                // Update N
//                N = N / i;
//            }
//        }
//        i++;
//    }
// 
//    // Print value of stack st
//    while (!st.isEmpty())
//    {
//        System.out.println(st.peek());
//        st.pop();
//    }
//}
//
//// Driver Code   
//public static void main (String[] args)   
//{   
//    int N = 8;
//     
//    // Function Call
//    PrimeFactors(N);;
//
//}
//}
//-----Q8 in stack and queue
//import java.util.*;
//public class DataMed{
//static void PrimeFactors(int N)
//{
//	
//	// Stores prime factors of N
//	// in decreasing order
//	Queue<Integer> qe = new Queue<Integer>();
//
//	int i = 2;
//	
//	while (N != 1)
//	{
//		if (N % i == 0)
//		{
//			
//			// Insert i into stack
//			 qe.enqueue();
//
//			while (N % i == 0)
//			{
//				
//				// Update N
//				N = N / i;
//			}
//		}
//
//		// Update i
//		i++;
//	}
//
//	// Print value of stack st
//	while (!qe.isEmpty())
//	{
//		System.out.println(qe.peek());
//		qe.dequeue();
//	}
//}
//
//// Driver Code
//public static void main (String[] args)
//{
//	int N = 8;
//	
//	// Function Call
//	PrimeFactors(N);;
//}
//}
//
//// This code is contributed by susmitakundugoaldanga
//  




    

