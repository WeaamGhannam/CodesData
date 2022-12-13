
package questionlinkedlist;

//public class QuestionLinkedList {

import java.util.LinkedList;
import questionlinkedlist.QuestionLinkedList.Node;

//
//  static class Node
//{
//    int data;
//    Node next;
//};
// 
//static boolean isSortedDesc(Node head)
//{
//    if (head == null)
//        return true;
// 
//    // Traverse the list till last node and return
//    // false if a node is smaller than or equal
//    // its next.
//    for (Node t = head; t.next != null; t = t.next)
//    if (t.data <= t.next.data)
//            return false;
//    return true;
//}
//static boolean isSortedAsce(Node head)
//{
//    if (head == null)
//        return true;
// 
//    // Traverse the list till last node and return
//    // false if a node is smaller than or equal
//    // its next.
//    for (Node t = head; t.next != null; t = t.next)
//    if (t.data >= t.next.data)
//            return false;
//    return true;
//}
// 
//static Node newNode(int data)
//{
//    Node temp = new Node();
//    temp.next = null;
//    temp.data = data;
//    return temp;
//}
// 
//// Driver Code
//public static void main(String[] args)
//{
//    Node head = newNode(1);
//    head.next = newNode(2);
//    head.next.next = newNode(3);
//    head.next.next.next = newNode(4);
//         
//    if(isSortedDesc(head))
//        System.out.println("Yes is Desc");
//    else if(isSortedAsce(head))
//        System.out.println("yes is Asce");
//     else
//      System.out.println("no");  
//}
//}

/////
//public class QuestionLinkedList {
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next=null;
//        }
//    }
//    public void SortList(){
//        int count[]={0,0,0};
//        Node ptr=head;
//        while(ptr!=null){
//           count[ptr.data]++;
//           ptr=ptr.next;
//        }
//        int i=0;
//        ptr=head;
//        
//    
//            while (ptr != null)
//        {
//            if (count[i] == 0)
//                i++;
//            else
//            {
//               ptr.data= i;
//               --count[i];
//               ptr = ptr.next;
//            }
//         }
//    }
//public void push(int new_data){
//    Node new_node=new Node(new_data);
//    new_node.next=head;
//    head=new_node;
//}
//public void printList(){
//    Node temp=head;
//    while(temp!=null){
//        System.out.print(temp.data +"");
//        temp=temp.next;
//    }
//    System.out.println();
//}
//public static void main(String[] args){
//    LinkedList list=new LinkedList();
//    list.push(0);
//    list.push(1);
//    list.push(0);
//    list.push(2);
//    list.push(0);
//    list.push(1);
//    list.push(2);
//    list.push(1);
//    list.push(2);
//    
//    
//       System.out.println("Linked List before sorting");
//       list.printList();
//         
//        list.sortList();
// 
//        System.out.println("Linked List after sorting");
//        list.printList();
//    }
//
//
//}
//q4 
//public class QuestionLinkedList {
//    Node head;
//
//    private static class node {
//
//        public node(int i) {
//        }
//    }
//
//    public class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next=null;
//        }
//
//        private Node(int i) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        private Node(int i) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }
//      public void insert(node a)
//    {
//        Node d = null;
//         
//        // Empty List
//        if (head == null)
//            head = d;
// 
//        // Insert in the beginning of the list
//        else
//        {
//            d.next = head;
//            head = d;
//        }
//    }
//
//   public void printList()
//    {
//        Node ptr = head;
// 
//        while (ptr != null)
//        {
//            System.out.print(ptr.data + "->");
//            ptr = ptr.next;
//        }
//        System.out.print("null" + "\n");
//    }
//   void addDigit(int n)
//    {
// 
//        // To keep track of the last node
//        // whose value is less than 9
//        Node lastNode = null;
//        Node curr = head;
// 
//        while (curr.next != null)
//        {
//            if (curr.data< 9)
//                lastNode = curr;
// 
//            curr = curr.next;
//        }
// 
//        // Add the given digit to the last node
//        curr.data = curr.data+ n;
// 
//        // In case of overflow in the last node
//        if (curr.data > 9)
//        {
//            curr.data = curr.data % 10;
// 
//            // If the list is of the
//            // form 9.9.9....
//            if (lastNode == null)
//            {
// 
//                // Insert a node at the beginning as
//                // there would be overflow in the
//                // head in this case
//                insert(new Node(1));
// 
//                lastNode = head.next;
//            }
// 
//            while (lastNode != curr)
//            {
//                lastNode.data = (lastNode.data + 1) % 10;
//                lastNode=lastNode.data;
//            }
//        }
//    }
// 
//
//
//public static void main(String[] args){
//    LinkedList list=new LinkedList();
//    list.insert(new node(9));
//    list.insert(new node(9));
//    list.insert(new node(9));
//    list.insert(new node(3));
//    list.printList();
//    list.addDigit(5);
//    list.printList();
//       System.out.println("Linked List before sorting");
//    }
//
//
//}
//----------------------
//public class QuestionLinkedList {
//
//    private static Node newNode(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            int data;
//            next=null;
//        }
//    }
//    public Node getIntersectionNode(Node head1,Node head2){
//      while(head2!=null){
//        Node temp=head1;
//        while(temp!=null){
//            if(temp==head2){
//                return head2;
//            }
//            temp=temp.next;
//        }
//        head2=head2.next;
//      }  
//      return null;  
//    }
//    public static void main(String[] args){
//       QuestionLinkedList list=new QuestionLinkedList();
//       Node head1,head2;
//       head1=new Node(10);
//       head2=new Node(3);
//       
//        Node newNode = newNode(6);
//        head2.next = newNode;
// 
//        newNode = newNode(9);
//        head2.next.next = newNode;
// 
//        newNode = newNode(15);
//        head1.next = newNode;
//        head2.next.next.next = newNode;
// 
//        newNode = newNode(30);
//        head1.next.next = newNode;
// 
//        head1.next.next.next = null;
//        Node intersectionPoint = list.getIntersectionNode(head1, head2);
//                 if (intersectionPoint == null) {
//            System.out.print(" No Intersection Point \n");
//        }
//        else {
//            System.out.print("Intersection Point: "
//                             + intersectionPoint.data);
//        }
//
//        
//    }
//    
//}
//
//    
//-----------
//public class QuestionLinkedList {
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            int data;
//            next=null;
//        }
//    }
//    public void removeDuplicate(){
//     Node curr=head;
//     while(curr!=null){
//         Node temp=curr;
//         while(temp!=null && temp.data==(curr.data)){
//           temp=temp.next;
//         }
//         curr.next=temp;
//         curr=curr.next;
//     }
//    }
//    public void push(int new_data){
//        Node new_node=new Node(new_data);
//         new_node.next=head;
//         head=new_node;
//    }
//    public void printList(){
//         Node temp = head;
//         while (temp != null)
//         {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//         }  
//         System.out.println();
// 
//    }
//     public static void main(String[] args){
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.push(1);
//        list.push(2);
//        list.push(2);
//        list.push(5);
//        list.push(5);
//        list.push(5);
//        list.push(8);
//        list.push(11);
//        list.push(11);
//          
//        System.out.println("List before removal of duplicates");
//        list.printList(); 
//        list.removeDuplicate();
//          
//        System.out.println("List after removal of elements" );
//        list.printList();
//
//         
//     }
//    
//}
//
//--------------------------------
//public class QuestionLinkedList {
//    static Node a=null,b=null;
//    static Node dummy = null;
//    static Node tail = null;
//    Node head;
//
//    private void sortedIntersect() {
//        Node p=a,q=b;
//        while(p!=null && q!=null){
//            if(p.data==q.data){
//                push(p.data);
//                p=p.next;
//                q=q.next;
//            }
//            else if(p.data < q.data)
//                p = p.next;
//            else
//                q= q.next;
//
//        }
//    }
//
//    private void printList(Node start) {
//        Node p=start;
//        while(p!=null){
//            System.out.print(p.data +"");
//            p=p.next;
//        }
//         System.out.println();
//    }
//
//    private void push(int data) {
//        Node temp=new Node(data);
//        if(dummy==null){
//           dummy=temp;
//           tail=temp;
//        }
//    }
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//             this.data=data;
//            next=null;
//        }
//    }
//
//    public void removeDuplicate(){
//     Node curr=head;
//     while(curr!=null){
//         Node temp=curr;
//         while(temp!=null && temp.data==(curr.data)){
//           temp=temp.next;
//         }
//         curr.next=temp;
//         curr=curr.next;
//     }
//    }
//   
//
//     public static void main(String[] args){
//        QuestionLinkedList list = new QuestionLinkedList();
//        
//        list.a = newNode(1);
//        list.a.next = new Node(2);
//        list.a.next.next = new Node(3);
//        list.a.next.next.next = new Node(4);
//        list.a.next.next.next.next = new Node(6);
// 
//        // creating second linked list
//        list.b = new Node(2);
//        list.b.next = new Node(4);
//        list.b.next.next = new Node(6);
//        list.b.next.next.next = new Node(8);
//         
//        // function call for intersection
//        list.sortedIntersect();
//       
//        // print required intersection
//        System.out.println("Linked list containing common items of a & b");
//        list.printList(dummy);
//
//
//         
//     }
//    
//}
//---------------
//public class QuestionLinkedList {
//    static class Node
//{
//    int data;
//    Node next;
//}
//   private static void printlist(Node head) {
//        Node node = new Node();
//     
//      while (node != null)
//    {
//        System.out.print(node.data + "->");
//        node = node.next;
//    }
//    System.out.println("NULL") ;
//    }
//
//    private static Node rearrangeEvenOdd(Node head) {
//        if(head==null)
//            return null;
//        Node odd = head;
//    Node even = head.next;
// 
//    // Remember the first node of even list so
//    // that we can connect the even list at the
//    // end of odd list.
//    Node evenFirst = even;
// 
//    while (1 == 1)
//    {
//        // If there are no more nodes, 
//        // then connect first node of even 
//        // list to the last node of odd list
//        if (odd == null || even == null ||
//                        (even.next) == null)
//        {
//            odd.next = evenFirst;
//            break;
//        }
// 
//        // Connecting odd nodes
//        odd.next = even.next;
//        odd = even.next;
// 
//        // If there are NO more even nodes 
//        // after current odd.
//        if (odd.next == null)
//        {
//            even.next = null;
//            odd.next = evenFirst;
//            break;
//        }
// 
//        // Connecting even nodes
//        even.next = odd.next;
//        even = odd.next;
//    }
//    return head;
//}
//
//static Node newNode(int key)
//{
//    Node temp = new Node();
//    temp.data = key;
//    temp.next = null;
//    return temp;
//}
//public static void main(String[] args)
//{
//    Node head = newNode(1);
//    head.next = newNode(2);
//    head.next.next = newNode(3);
//    head.next.next.next = newNode(4);
//    head.next.next.next.next = newNode(5);
//    head.next.next.next.next.next = newNode(6);
//    System.out.println("Given Linked List");
//    printlist(head);
// 
//    head = rearrangeEvenOdd(head);
// 
//    System.out.println("Modified Linked List");
//    printlist(head);
//}
//
//}
///////////////

//  public class QuestionLinkedList {
//    static Node head;
//    static class Node {
//  
//        int data;
//        Node next;
//  
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
//    static Node reverse(Node node)
//    {
//        Node prev = null;
//        Node current = node;
//          
//        while (current != null) {
//            Node next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        node = prev;
//        return node;
//    }
//static  Node reverseBetween(Node head, int m, int n)
//{
//    if (m == n)
//        return head;
//    Node revs = null, revs_prev = null;
//    Node revend = null, revend_next = null;
//  
//    // Find values of above pointers.
//    int i = 1;
//    Node curr = head;
//    while (curr!=null && i <= n) {
//        if (i < m)
//            revs_prev = curr;
//        if (i == m)
//            revs = curr;
//        if (i == n) {
//            revend = curr;
//            revend_next = curr.next;
//        }
//        curr = curr.next;
//        i++;
//    }
//    revend.next = null;
//    // Reverse linked list starting with revs.
//    revend = reverse(revs);
//    // If starting position was not head
//    if (revs_prev!=null)
//        revs_prev.next = revend;
//    // If starting position was head
//    else
//        head = revend;
//    revs.next = revend_next;
//    return head;
//}
//    // prints content of double linked list
//    void printList(Node node)
//    {
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }
//  
//    // Driver Code
//    public static void main(String[] args)
//    {
//        QuestionLinkedList list = new QuestionLinkedList();
//        list.head = new Node(1);
//        list.head.next = new Node(5);
//        list.head.next.next = new Node(8);
//        list.head.next.next.next = new Node(4);
//        list.head.next.next.next.next = new Node(7);
//        list.head.next.next.next.next.next = new Node(9);
//        list.head.next.next.next.next.next.next = new Node(6);
//        list.head.next.next.next.next.next.next.next = new Node(3);
//        reverseBetween(head,2,5);
//        list.printList(head);
//          
//    }
//}
/////
//import java.util.*;
//  
//class QuestionLinkedList
//{
//  
//// A linked list node 
//static class Node 
//{ 
//    int data; 
//    Node next; 
//}; 
//  
///* Function to insert a node at the beginning */
//static Node push( Node head_ref, int new_data) 
//{ 
//    /* allocate node */
//    Node new_node = new Node(); 
//  
//    /* put in the data */
//    new_node.data = new_data; 
//  
//    /* link the old list off the new node */
//    new_node.next = (head_ref); 
//  
//    /* move the head to point to the new node */
//    (head_ref) = new_node;
//      
//    return head_ref;
//} 
//  
///* Function to print linked list */
//static void printList( Node head) 
//{ 
//    Node temp = head; 
//    while (temp != null) 
//    { 
//        System.out.printf("%d ", temp.data); 
//        temp = temp.next; 
//    } 
//    System.out.printf("\n"); 
//} 
//
//static void skipMdeleteN( Node head, int M, int N) 
//{ 
//    Node curr = head, t; 
//    int count; 
//  
//    while (curr!=null) 
//    { 
//        // Skip M nodes 
//        for (count = 1; count < M && curr != null; count++) 
//         
//        if (curr == null) 
//            return; 
//  
//        t = curr.next; 
//        for (count = 1; count <= N && t != null; count++) 
//        { 
//            Node temp = t; 
//            t = t.next; 
//        } 
//        curr.next = t; 
//  
//        curr = t; 
//    } 
//} 
//  
//// Driver code 
//public static void main(String args[])
//{ 
//    Node head = null; 
//    int M=2, N=3; 
//    head=push(head, 1); 
//    head=push(head, 2); 
//    head=push(head, 8); 
//    head=push(head, 5); 
//    head=push(head, 4); 
//    head=push(head, 7); 
//    head=push(head, 9); 
//    head=push(head, 5); 
//    head=push(head, 9); 
//    head=push(head, 6);
//    head=push(head, 7); 
//    head=push(head, 8);
//  
//    System.out.printf("M = %d, N = %d \nGiven" + 
//                        "Linked list is :\n", M, N); 
//    printList(head); 
//  
//    skipMdeleteN(head, M, N); 
//  
//    System.out.printf("\nLinked list after deletion is :\n"); 
//    printList(head); 
//} 
//}
//public class QuestionLinkedList{
//        class node
//    {
//        int val;
//        node next;
// 
//        public node(int val)
//        {
//            this.val = val;
//        }
//    }
// void printlist(node head)
//    {
//        while (head != null)
//        {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//    }
// 
//    node head1, head2, result;
//    int carry;
// void push(int val, int list)
//    {
//        node newnode = new node(val);
//        if (list == 1)
//        {
//            newnode.next = head1;
//            head1 = newnode;
//        }
//        else if (list == 2)
//        {
//            newnode.next = head2;
//            head2 = newnode;
//        }
//        else
//        {
//            newnode.next = result;
//            result = newnode;
//        }
// 
//    }
//void addsamesize(node n, node m)
//    {
//        // Since the function assumes linked lists are of
//        // same size, check any of the two head pointers
//        if (n == null)
//            return;
// 
//        // Recursively add remaining nodes and get the carry
//        addsamesize(n.next, m.next);
// 
//        // add digits of current nodes and propagated carry
//        int sum = n.val + m.val + carry;
//        carry = sum / 10;
//        sum = sum % 10;
// 
//        // Push this to result list
//        push(sum, 3);
// 
//    }
// 
//    node cur;
// 
//    // This function is called after the smaller list is
//    // added to the bigger lists's sublist of same size.
//    // Once the right sublist is added, the carry must be
//    // added to the left side of larger list to get the
//    // final result.
//    void propogatecarry(node head1)
//    {
//        // If diff. number of nodes are not traversed, add carry
//        if (head1 != cur)
//        {
//            propogatecarry(head1.next);
//            int sum = carry + head1.val;
//            carry = sum / 10;
//            sum %= 10;
// 
//            // add this node to the front of the result
//            push(sum, 3);
//        }
//    }
// 
//    int getsize(node head)
//    {
//        int count = 0;
//        while (head != null)
//        {
//            count++;
//            head = head.next;
//        }
//        return count;
//    }
//
//
//       public void addlists(){
//       if (head1 == null)
//        {
//            result = head2;
//            return;
//        }
//               if (head2 == null)
//        {
//            result = head1;
//            return;
//        }
// 
//        int size1 = getsize(head1);
//        int size2 = getsize(head2);
// 
//        // Add same size lists
//        if (size1 == size2)
//        {
//            addsamesize(head1, head2);
//        }
//        else
//        {
//            // First list should always be larger than second list.
//            // If not, swap pointers
//            if (size1 < size2)
//            {
//                node temp = head1;
//                head1 = head2;
//                head2 = temp;
//            }
//            int diff = Math.abs(size1 - size2);
// 
//            // move diff. number of nodes in first list
//            node temp = head1;
//            while (diff-- >= 0)
//            {
//                cur = temp;
//                temp = temp.next;
//            }
// 
//            // get addition of same size lists
//            addsamesize(cur, head2);
// 
//            // get addition of remaining first list and carry
//            propogatecarry(head1);
//        }
//            // if some carry is still there, add a new node to
//            // the front of the result list. e.g. 999 and 87
//            if (carry > 0)
//                push(carry, 3);
//         
//           
//       }
//public static void main(String args[]){
//    QuestionLinkedList list=new QuestionLinkedList();
//    list.head1=null;
//    list.head2=null;
//    list.result=null;
//    list.carry=0;
//    int a1[]={5,7,3,4};
//    int a2[]={9,4,6};
//    for(int i=a1.length;i>=0;--i)
//        list.push(a1[i],1);
//     for(int i=a2.length;i>=0;--i)
//        list.push(a1[i],1);
//     
//     list.addlists();
//     list.printlist(list.result);
//}
//    
//}
//	 
//
//
//
//----------------------
public class QuestionLinkedList{
    Node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    public void removeduplicate(){
        Node curr=head; 
    }
}
