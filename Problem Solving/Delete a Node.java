// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?isFullScreen=true



    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode t=head;
         SinglyLinkedListNode t1;
          if (position == 0){
        return head.next;
    }
    while (--position > 0){
        t = t.next;
    }
    t.next = t.next.next;
    return head;
                                                              

    }

