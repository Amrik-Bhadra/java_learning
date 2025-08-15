package com.dsachallenge.linkedlist.doubly_linkedlist;

import org.w3c.dom.Node;

import java.util.Scanner;

public class DoublyLinkedList {
    private DLLNode head;
    public DoublyLinkedList(){
        head = null;
    }

    public DLLNode getHead(){
        return head;
    }

    public void insertAtEnd(int data){
        if(head == null) head = new DLLNode(data, null, null);
        else{
            DLLNode temp = getHead();
            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            DLLNode newNode = new DLLNode(data, temp, null);
            temp.setNext(newNode);
        }
    }

    public void insertAtFront(int data){
        if(head == null) head = new DLLNode(data, null, null);
        else{
            head = new DLLNode(data, null, head);
        }
    }

    public void deleteFromEnd(){
        if(head == null) System.out.println("List is empty!");
        else if(head.getNext() == null) head = null;
        else{
            DLLNode temp = getHead();
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }

            temp.getNext().setPrev(null);
            temp.setNext(null);
        }
    }

    public void deleteFromFront(){
        if(head == null) System.out.println("List is empty!");
        else if(head.getNext() == null) head = null;
        else{
            DLLNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            head.setPrev(null);
        }
    }

    public void display(){
        if(head == null) System.out.println("List is empty!");
        else{
            DLLNode temp = head;
            System.out.print("List elements: ");
            while(temp != null){
                System.out.print(temp.getData() + " -> ");
                temp = temp.getNext();
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner in = new Scanner(System.in);
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
                    dll.insertAtEnd(data);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    data = in.nextInt();
                    dll.insertAtFront(data);
                    break;

                case 3:
                    dll.deleteFromEnd();
                    break;

                case 4:
                    dll.deleteFromFront();
                    break;

                case 5:
                    dll.display();
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
