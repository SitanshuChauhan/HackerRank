//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem?isFullScreen=true



    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
SinglyLinkedListNode c=head.next;
SinglyLinkedListNode p=head;
SinglyLinkedListNode n=null;

if(head==null)
System.out.println(0);
else{
while(c!=null){
    n=c.next;
    c.next=p;
    p=c;
    c=n;
    
   
}

head.next=null;
head=p;
while(head!=null){
    System.out.println(head.data);
    head=head.next;
}
}
    }

