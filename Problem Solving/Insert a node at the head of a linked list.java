
// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true
    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
SinglyLinkedListNode insertathead=new SinglyLinkedListNode(data);
SinglyLinkedListNode t;
if(llist==null)
return insertathead;
t=insertathead;
insertathead.next=llist;
llist=t;
return llist;



    }

