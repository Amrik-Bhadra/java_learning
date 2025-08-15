package com.dsachallenge.linkedlist.singly_linkedlist;

import java.util.Stack;

public class ReverseALinkedList extends SinglyLinkedList{
    public void reverseTheList(){
        SLLNode currPtr = getHead(), prevPtr = null, nextPtr;
        while(currPtr != null){
            nextPtr = currPtr.getNext();
            currPtr.setNext(prevPtr);
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        setHead(prevPtr);
    }

    public void reverseUsingStack(){
        Stack<SLLNode> stk = new Stack<>();
        SLLNode temp = getHead();
        while(temp != null){
            stk.add(temp);
            temp = temp.getNext();
        }

        if (!stk.isEmpty()) {
            setHead(stk.pop());
            temp = getHead();
        }
        while(!stk.isEmpty()){
            temp.setNext(stk.pop());
            temp = temp.getNext();
        }

        assert temp != null;
        temp.setNext(null);
    }

    public static void main(String[] args) {
        ReverseALinkedList sll = new ReverseALinkedList();
        for(int i=1; i<=5; i++){
            sll.insertAtFront(i);
        }

        sll.display();
//        sll.reverseTheList();
        sll.reverseUsingStack();
        sll.display();

    }
}
