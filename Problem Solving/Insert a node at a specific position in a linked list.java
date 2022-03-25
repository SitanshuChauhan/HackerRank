
//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode insertvalue=new SinglyLinkedListNode(data);
        SinglyLinkedListNode t=head;
        SinglyLinkedListNode t1;
        
        if(head==null)
        return insertvalue;
for(int i=1;i<position;i++){
    t=t.next;
}
t1=t.next;
t.next=insertvalue;
insertvalue.next=t1;

return head;


    }

