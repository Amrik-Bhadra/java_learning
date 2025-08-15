package com.dsachallenge.linkedlist.circular_linkedlist;

import java.util.Scanner;

public class CircularLinkedList {
    private CLLNode head;
    public CircularLinkedList(){
        this.head = null;
    }



    public void insertAtEnd(int data){
        if(head == null){
            head = new CLLNode(data, null);
            head.setNext(head);
        }else if(head.getNext() == head){
            CLLNode newNode = new CLLNode(data, head);
            head.setNext(newNode);
        }else{
            CLLNode temp = head;
            do{
                temp = temp.getNext();
            }while(temp.getNext() != head);

            CLLNode newNode = new CLLNode(data, head);
            temp.setNext(newNode);
        }
    }

    public void insertAtFront(int data){
        CLLNode newNode = new CLLNode(data, null);
        if (head == null){
            newNode.setNext(newNode);
        } else {
            CLLNode temp = head;
            while(temp.getNext() != head){
                temp = temp.getNext();
            }
            newNode.setNext(head);
            temp.setNext(newNode);
        }
        head = newNode;
    }

    public void display(){
        if(head == null) System.out.println("List is empty!");
        else{
            CLLNode temp = head;
            do{
                System.out.print(temp.getData() + " -> ");
                temp = temp.getNext();
            }while(temp != head);
            System.out.println("[" + head.getData() + "]");
        }
    }

    public void deleteFromEnd(){
        if(head == null) {
            System.out.println("List is empty");
        } else if(head.getNext() == head) {
            head = null;
        } else {
            CLLNode temp = head;
            while(temp.getNext().getNext() != head){
                temp = temp.getNext();
            }
            temp.setNext(head);
        }
    }


    public void deleteFromFront(){
        if(head == null) System.out.println("List is empty!");
        else{
            head = head.getNext();
            CLLNode temp = head;
            while(temp.getNext() != head){
                temp = temp.getNext();
            }

            temp.setNext(head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Scanner in = new Scanner(System.in);
        char ch;
        int data;
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
                    cll.insertAtEnd(data);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    data = in.nextInt();
                    cll.insertAtFront(data);
                    break;

                case 3:
                    cll.deleteFromEnd();
                    break;

                case 4:
                    cll.deleteFromFront();
                    break;

                case 5:
                    cll.display();
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
