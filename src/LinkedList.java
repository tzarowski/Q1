public class LinkedList {

    private ListNode head = null;
    private ListNode tail = null;
    private int size = 0;

    public void addFirst(Object toAdd){
        head = new ListNode(toAdd, head);
        size++;
    }

    public void add(Object toAdd){

        if (size == 0) {
            //head and tail will be the same
            head = new ListNode(toAdd, head);
            tail = head;
            size++;
        }
        else{
            //head and tail will be different
            ListNode node = tail;
            node.next = new ListNode(toAdd, node.next);
            tail = node.next;
            size++;
        }

    }

    public Object get(int index){

        if(index<0 || index >= size){
            return "error";
        }
        else{
            ListNode node = head;
            for (int j = 0;j<index;j++){
                node=node.next;
            }
            return node.element;
        }
    }

    public void insert(Object toAdd, int index){
        if(index<0 || index >= size){
            //error handle
        }


        else if (index == 0){
            addFirst(toAdd);
        }
        else{
            ListNode node = head;

            for (int j=0; j<index-1; j++){
                node = node.next;
            }

            node.next = new ListNode(toAdd, node.next);
            size++;

        }

    }

    public void remove (int index){

        if(index<0 || index>=size){
            //error handle
        }
        else if (index == 0){
            head = head.next;
            size--;
            return;
        }
        else{
            ListNode node = head;
            for (int j = 0; j<index-1; j++){
                node = node.next;
            }
            node.next = node.next.next;
            size--;
        }

    }
}
