//https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true



    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
SinglyLinkedListNode p=null;
SinglyLinkedListNode c=head;
SinglyLinkedListNode n=null;
if(head==null)
    return null;
if(head.next==null)
    return head;    
    
    while (c!=null){
       
        n=c.next;
        c.next=p;
        p=c;
        c=n;
    }
return p;


    }

