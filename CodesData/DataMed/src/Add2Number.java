
import java.util.LinkedList;
import java.util.Stack;
import javafx.scene.Node;
import java.util.*;

public class Add2Number {
//   public static Node head1, head2;
//       static class Node {
//
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//    private static void addZeros(Node Start1, Node Start2) {
//        Node next1 = Start1.next;
//        Node next2 = Start2.next;
//        while (next1 != null && next2 != null) {
//            next1 = next1.next;
//            next2 = next2.next;
//        }
//        while (next1 == null && next2 != null) {
//            while (next2 != null) {
//                if (next1 == null && next2 != null) {
//
//                    while (next2 != null) {
//
//                        Node node = new Node(0);
//
//                        node.next = Start1.next;
//
//                        Start1.next = node;
//
//                        next2 = next2.next;
//
//                    }
//
//                } else if (next2 == null && next1 != null) {
//
//                    while (next1 != null) {
//
//                        Node node = new Node(0);
//
//                        node.next = Start2.next;
//
//                        Start2.next = node;
//
//                        next1 = next1.next;
//
//                    }
//                }
//            }
//        }
//    }
//
//    private static int sumTwoNodes(Node l1, Node l2, Node result) {
//        if (l1 == null) {
//            return 0;
//
//        }
//        int num = l1.data + l2.data + sumTwoNodes(l1, l2, result);
//        Node node = new Node(num % 10);
//        node.next = result.next;
//        result.next = node;
//        return num / 10;
//    }
//
//        void printList(Node head) {
//        while (head != null) {
//            System.out.print(head.data + "");
//            head = head.next;
//        }
//        System.out.print("");
//    }
//
//    public static void addTwoNumbers(Node l1, Node l2) {
//        Node Start1 = new Node(0);
//        Start1.next = l1;
//        Node Start2 = new Node(0);
//        Start2.next = l2;
//        addZeros(Start1, Start2);
//        Node result = new Node(0);
//        if (sumTwoNodes(Start1.next, Start2.next, result) == 1) {
//            Node node = new Node(1);
//            node.next = result.next;
//            result.next = node;
//        }
//
//        printList(result.next);
//
//    }
//


    static Node head1, head2;

    private void printList(Node head1) {
     while (head1 != null) {
       System.out.print(head1.data + "");
           head1 = head1.next;
       }
       System.out.print("");   
    }
 
    static class Node {
 
        int data;
        Node next;
        private Node nedummy;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static Node addTwoLists(Node first, Node second) {
  Node start1 = new Node(0);
  start1.next = first;
  Node start2 = new Node(0);
  start2.next = second;
  addPrecedingZeros(start1, start2);
  Node result = new Node(0);
  if (sumTwoNodes(start1.next, start2.next, result) == 1) {
    Node dummy = new Node(1);
    dummy.next = result.next;
    result.next = dummy;
  }
  return result.next;
}
public static int sumTwoNodes(Node first, Node second, Node result) {
  if (first == null) {
    return 0;
  }
  int sum = 0;
  sum += first.data;
  sum += second.data;
  sum += sumTwoNodes(first.next, second.next, result);
  Node dummy = new Node(sum % 10);
  dummy.next = result.next;
  result.next = dummy;
  return sum / 10;
}
public static void addPrecedingZeros(Node start1, Node start2) {
  Node next1 = start1.next;
  Node next2 = start2.next;
  while (next1 != null && next2 != null) {
    next1 = next1.next;
    next2 = next2.next;
  }
  if (next1 == null) {
    if (next2 != null) {
      while (next2 != null) {
        Node dummy = new Node(0);
        dummy.next = start1.next;
        start1.nedummy =dummy;
        next2 = next2.next;
      }
    }
  } else if (next2 == null) {
    if (next1 != null) {
      while (next1 != null) {
        Node dummy = new Node(0);
        dummy.next = start2.next;
        start2.next = dummy;
        next1 = next1.next;
      }
    }
  }
}
public static Node solve(Node first, Node second) {
  Node result = addTwoLists(first, second);
  return result;
}
    public static void main(String[] args) {
        Add2Number list = new Add2Number();
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List : ");
        list.printList(head1);
 
        // creating second list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List : ");
        list.printList(head2);
 
        System.out.print("Sum List : ");
        // add the two lists and see the result
        list.addTwoLists(head1, head2);
    }

}
