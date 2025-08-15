package com.dsachallenge.linkedlist.singly_linkedlist;

public class MiddleOfLinkedList extends SinglyLinkedList {
    public SLLNode getMiddle(){
        SLLNode fast = getHead();
        SLLNode slow = getHead();
        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return slow;
    }
    public static void main(String[] args) {
        MiddleOfLinkedList sll = new MiddleOfLinkedList();
        for(int i=1; i<=9; i++){
            sll.insertAtFront(i);
        }

        sll.display();
        SLLNode middleNode = sll.getMiddle();

        System.out.println("Middle Node: " + middleNode.getData());
    }
}
