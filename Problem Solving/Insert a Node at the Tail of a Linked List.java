//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true



    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode t=head;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
        if(head==null)
        return insertNode;
         while(t.next != null) {
            t = t.next;
        }
        t.next  = insertNode;
        insertNode.next = null;
 
        return head;



    }

