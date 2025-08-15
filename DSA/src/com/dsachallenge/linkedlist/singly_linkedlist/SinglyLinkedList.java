package com.dsachallenge.linkedlist.singly_linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
    private SLLNode head;
    private int count = 0;

    public SLLNode getHead(){ return head; }
    public void setHead(SLLNode newHead){
      this.head = newHead;
    }
    
    public SinglyLinkedList(){
        head = null;
    }

    public int getCount(){
        return count;
    }

    public void insertAtEnd(int data){
        if(head == null){
            head = new SLLNode(data, null);
        }else{
            SLLNode temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            SLLNode node = new SLLNode(data, null);
            temp.setNext(node);
        }

        count++;
    }

    public void insertAtFront(int data){
        if(head == null){
            head = new SLLNode(data, null);
        }else{
            head = new SLLNode(data, head);
        }

        count++;
    }

    public void deleteFromEnd(){
        if(head == null) System.out.println("List is empty");
        else if(head.getNext() == null) head = null;
        else{
            SLLNode temp = head;
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }

            temp.setNext(null);
        }

        count--;
    }

    public void deleteFromFront(){
        if(head == null) System.out.println("List is empty");
        else head = head.getNext();

        count--;
    }

    public void display(){
        if(head == null) System.out.println("List is empty");
        else{
            System.out.print("List elements: ");
            SLLNode temp = head;
            while(temp != null){
                System.out.print(temp.getData() + " -> ");
                temp = temp.getNext();
            }
            System.out.println("Null");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();

        char ch='\0';
        int data = 0;
        do{
            System.out.println("Main Menu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at front");
            System.out.println("3. Delete from end");
            System.out.println("4. Delete from front");
            System.out.println("5. Display list");
            System.out.print("\t-> ");
            int opt = in.nextInt();
            switch(opt){
                case 1:
                    System.out.print("Enter value: ");
                    data = in.nextInt();
                    sll.insertAtEnd(data);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    data = in.nextInt();
                    sll.insertAtFront(data);
                    break;

                case 3:
                    sll.deleteFromEnd();
                    break;

                case 4:
                    sll.deleteFromFront();
                    break;

                case 5:
                    sll.display();
                    break;

                default:
                System.out.println("Invalid option");

            }

            System.out.print("Do you want to continue?(Y/N): ");
            ch = in.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
        in.close();
    }
}
